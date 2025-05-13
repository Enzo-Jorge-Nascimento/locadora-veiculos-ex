package solutis.elasticode.locadora_veiculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticode.locadora_veiculo.entities.Acessorio;
import solutis.elasticode.locadora_veiculo.entities.Carro;
import solutis.elasticode.locadora_veiculo.enums.Categoria;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {

    List<Carro> findAllByModelo_Categoria(Categoria categoria);
    List<Carro> findAllByAcessorio(Acessorio acessorio);

}
