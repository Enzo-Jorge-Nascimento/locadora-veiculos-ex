package solutis.elasticode.locadora_veiculo.entities;

import jakarta.persistence.Entity;
import solutis.elasticode.locadora_veiculo.entities.abstracts.Pessoa;
import solutis.elasticode.locadora_veiculo.enums.Sexo;

import java.time.LocalDate;

@Entity
public class Funcionario extends Pessoa {

    private String matricula;

    public Funcionario(Integer id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String matricula) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
