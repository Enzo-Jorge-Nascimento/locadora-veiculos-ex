package solutis.elasticode.locadora_veiculo.dtos.motorista;

import solutis.elasticode.locadora_veiculo.enums.Sexo;

import java.time.LocalDate;

public class MotoristaRequest {

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private Sexo sexo;
    private String numeroCNH;

    public MotoristaRequest(String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCNH) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.numeroCNH = numeroCNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

}
