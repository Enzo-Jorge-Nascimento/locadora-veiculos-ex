package solutis.elasticode.locadora_veiculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticode.locadora_veiculo.entities.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {

    boolean existsByCarro_Id(Integer id);
    Aluguel findByCarro_Id(Integer id);

}
