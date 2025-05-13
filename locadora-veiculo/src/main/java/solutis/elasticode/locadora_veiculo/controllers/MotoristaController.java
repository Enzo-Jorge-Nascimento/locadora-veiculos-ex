package solutis.elasticode.locadora_veiculo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaMapping;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaRequest;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaResponse;
import solutis.elasticode.locadora_veiculo.services.MotoristaService;

@RestController
@RequestMapping("/motoristas")
public class MotoristaController {

    private final MotoristaService service;

    public MotoristaController(MotoristaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<MotoristaResponse> cadastrar(MotoristaRequest req) {
        return ResponseEntity.status(201).body(MotoristaMapping.toResponse(service.cadastrar(req)));
    }

}
