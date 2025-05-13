package solutis.elasticode.locadora_veiculo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticode.locadora_veiculo.dtos.aluguel.AluguelRequest;
import solutis.elasticode.locadora_veiculo.dtos.aluguel.AluguelResponse;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaRequest;
import solutis.elasticode.locadora_veiculo.entities.Aluguel;
import solutis.elasticode.locadora_veiculo.services.AluguelService;

import java.time.LocalDate;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {

    private final AluguelService service;

    public AluguelController(AluguelService service) {
        this.service = service;
    }

    @PostMapping("/{id}")
    public ResponseEntity<AluguelResponse> criarNovoAluguel(@RequestBody AluguelRequest aluReq, @RequestBody MotoristaRequest motReq, @PathVariable Integer idCarro) {
        Aluguel aux = service.buscarPorIdDeCarro(idCarro);

        if (aux != null) {
            if (aux.getDataDevolucao().isAfter(LocalDate.now())) {
                return ResponseEntity.status(422).build();
            }
        }

        return ResponseEntity.status(201).body(service.criarNovoAluguel(aluReq, motReq, idCarro));
    }

}