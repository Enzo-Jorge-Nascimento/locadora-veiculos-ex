package solutis.elasticode.locadora_veiculo.dtos.carro;

import solutis.elasticode.locadora_veiculo.entities.Acessorio;
import solutis.elasticode.locadora_veiculo.entities.ModeloCarro;

import java.math.BigDecimal;

public class CarroResponse {

    private String placa;
    private String chassi;
    private String cor;
    private BigDecimal valorDiaria;
    private ModeloCarro modelo;
    private Acessorio acessorio;

    public CarroResponse(String placa, String chassi, String cor, BigDecimal valorDiaria, ModeloCarro modelo, Acessorio acessorio) {
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.valorDiaria = valorDiaria;
        this.modelo = modelo;
        this.acessorio = acessorio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public ModeloCarro getModelo() {
        return modelo;
    }

    public void setModelo(ModeloCarro modelo) {
        this.modelo = modelo;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }


}
