package solutis.elasticode.locadora_veiculo.services;

import org.springframework.stereotype.Service;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaMapping;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaRequest;
import solutis.elasticode.locadora_veiculo.entities.Motorista;
import solutis.elasticode.locadora_veiculo.repositories.MotoristaRepository;

@Service
public class MotoristaService {

    private final MotoristaRepository repository;

    public MotoristaService(MotoristaRepository repository) {
        this.repository = repository;
    }

    public Motorista cadastrar(MotoristaRequest req) {
        return repository.save(MotoristaMapping.toEntity(req));
    }

}
