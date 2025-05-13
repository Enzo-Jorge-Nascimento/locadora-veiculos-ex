package solutis.elasticode.locadora_veiculo.dtos.motorista;

import java.time.LocalDate;

public class MotoristaResponse {

    private String nome;
    private LocalDate dataNascimento;
    private String numeroCNH;

    public MotoristaResponse(String nome, LocalDate dataNascimento, String numeroCNH) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
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

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

}
