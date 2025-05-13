package solutis.elasticode.locadora_veiculo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticode.locadora_veiculo.dtos.carro.CarroResponse;
import solutis.elasticode.locadora_veiculo.dtos.carro.CarroResponseResumed;
import solutis.elasticode.locadora_veiculo.entities.Acessorio;
import solutis.elasticode.locadora_veiculo.enums.Categoria;
import solutis.elasticode.locadora_veiculo.services.CarroService;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroService service;

    public CarroController(CarroService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CarroResponseResumed>> listar() {
        List<CarroResponseResumed> response = service.listar();

        return (response.isEmpty()) ? ResponseEntity.status(204).build() : ResponseEntity.status(200).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarroResponse> carroDetalhado(@PathVariable Integer id) {
        if (id == null) return ResponseEntity.status(400).build();

        CarroResponse response = service.carroDetalhado(id).get();

        return (response == null) ? ResponseEntity.status(404).build() : ResponseEntity.status(200).body(response);
    }

    @GetMapping("/lista-categoria")
    public ResponseEntity<List<CarroResponse>> listarPorCategoria(@RequestParam Categoria categoria) {
        if (categoria == null) return ResponseEntity.status(400).build();

        List<CarroResponse> response = service.listarPorCategoria(categoria);

        return (response.isEmpty()) ? ResponseEntity.status(204).build() : ResponseEntity.status(200).body(response);
    }

    @GetMapping("/lista-acessorio")
    public ResponseEntity<List<CarroResponse>> listarPorAcessorio(@RequestBody Acessorio acessorio) {
        if (acessorio == null) return ResponseEntity.status(400).build();

        List<CarroResponse> response = service.listarPorAcessorio(acessorio);

        return (response.isEmpty()) ? ResponseEntity.status(204).build() : ResponseEntity.status(200).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Integer id) {
        if (id == null) return ResponseEntity.status(400).build();

        service.deletarPorId(id);

        return ResponseEntity.status(204).build();
    }

}
