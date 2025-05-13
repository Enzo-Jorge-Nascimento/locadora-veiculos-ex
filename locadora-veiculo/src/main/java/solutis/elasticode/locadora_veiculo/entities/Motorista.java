package solutis.elasticode.locadora_veiculo.entities;

import jakarta.persistence.Entity;
import solutis.elasticode.locadora_veiculo.entities.abstracts.Pessoa;
import solutis.elasticode.locadora_veiculo.enums.Sexo;

import java.time.LocalDate;

@Entity
public class Motorista extends Pessoa {

    private String numeroCNH;

    public Motorista(Integer id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCNH) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.numeroCNH = numeroCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

}
