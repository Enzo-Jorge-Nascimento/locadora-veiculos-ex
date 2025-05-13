package solutis.elasticode.locadora_veiculo.services;

import org.springframework.stereotype.Service;
import solutis.elasticode.locadora_veiculo.dtos.carro.CarroMapping;
import solutis.elasticode.locadora_veiculo.dtos.carro.CarroResponse;
import solutis.elasticode.locadora_veiculo.dtos.carro.CarroResponseResumed;
import solutis.elasticode.locadora_veiculo.entities.Acessorio;
import solutis.elasticode.locadora_veiculo.enums.Categoria;
import solutis.elasticode.locadora_veiculo.repositories.CarroRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    private final CarroRepository repository;

    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }

    public List<CarroResponseResumed> listar() {
        return repository.findAll().stream().map(CarroMapping::toResumedResponse).toList();
    }
    
    public Optional<CarroResponse> carroDetalhado(Integer id) {
        return repository.findById(id).map(CarroMapping::toResponse);
    }

    public List<CarroResponse> listarPorCategoria(Categoria categoria) {
        return repository.findAllByModelo_Categoria(categoria).stream().map(CarroMapping::toResponse).toList();
    }

    public List<CarroResponse> listarPorAcessorio(Acessorio acessorio) {
        return repository.findAllByAcessorio(acessorio).stream().map(CarroMapping::toResponse).toList();
    }

    public void deletarPorId(Integer id) {
        repository.deleteById(id);
    }

}
