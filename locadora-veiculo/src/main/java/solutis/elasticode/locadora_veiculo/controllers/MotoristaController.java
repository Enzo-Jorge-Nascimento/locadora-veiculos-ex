package solutis.elasticode.locadora_veiculo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaMapping;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaRequest;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaResponse;
import solutis.elasticode.locadora_veiculo.entities.Motorista;
import solutis.elasticode.locadora_veiculo.services.MotoristaService;

import java.util.List;

@RestController
@RequestMapping("/motoristas")
public class MotoristaController {

    private final MotoristaService service;

    public MotoristaController(MotoristaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<MotoristaResponse> cadastrar(@RequestBody MotoristaRequest req) {
        if (req == null) return ResponseEntity.status(400).build();

        return ResponseEntity.status(201).body(MotoristaMapping.toResponse(service.cadastrar(req)));
    }

    @GetMapping
    public ResponseEntity<List<MotoristaResponse>> listar() {
        List<Motorista> response = service.listar();

        return (response.isEmpty()) ? ResponseEntity.status(204).build() : ResponseEntity.status(200).body(response.stream().map(MotoristaMapping::toResponse).toList());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Integer id) {
        if (id == null) return ResponseEntity.status(400).build();

        service.deletarPorId(id);

        return ResponseEntity.status(204).build();
    }

}
