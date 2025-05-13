package solutis.elasticode.locadora_veiculo.services;

import org.springframework.stereotype.Service;
import solutis.elasticode.locadora_veiculo.dtos.aluguel.AluguelMapping;
import solutis.elasticode.locadora_veiculo.dtos.aluguel.AluguelRequest;
import solutis.elasticode.locadora_veiculo.dtos.aluguel.AluguelResponse;
import solutis.elasticode.locadora_veiculo.dtos.carro.CarroMapping;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaMapping;
import solutis.elasticode.locadora_veiculo.dtos.motorista.MotoristaRequest;
import solutis.elasticode.locadora_veiculo.entities.Aluguel;
import solutis.elasticode.locadora_veiculo.entities.Carro;
import solutis.elasticode.locadora_veiculo.repositories.AluguelRepository;
import solutis.elasticode.locadora_veiculo.repositories.CarroRepository;

import java.util.Optional;

@Service
public class AluguelService {

    private final AluguelRepository aluRepo;
    private final CarroRepository carroRepo;

    public AluguelService(AluguelRepository aluRepo, CarroRepository carroRepo) {
        this.aluRepo = aluRepo;
        this.carroRepo = carroRepo;
    }

    public Aluguel buscarPorIdDeCarro(Integer id) {
        return (aluRepo.existsByCarro_Id(id)) ? aluRepo.findByCarro_Id(id) : null;
    }

    public AluguelResponse criarNovoAluguel(AluguelRequest aluReq, MotoristaRequest motReq, Integer idCarro) {
        Optional<Carro> carroOpt = carroRepo.findById(idCarro);
        Carro carro = carroOpt.get();

        Aluguel aluguel = AluguelMapping.toEntity(aluReq);
        aluguel.setMotorista(MotoristaMapping.toEntity(motReq));
        aluguel.setCarro(carro);

        aluRepo.save(aluguel);

        AluguelResponse response = AluguelMapping.toResponse(aluguel);
        response.setCarro(CarroMapping.toResumedResponse(carro));

        return response;
    }

}
