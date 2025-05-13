package solutis.elasticode.locadora_veiculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticode.locadora_veiculo.entities.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Integer> {



}
