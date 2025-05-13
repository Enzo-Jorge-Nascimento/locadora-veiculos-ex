package solutis.elasticode.locadora_veiculo.dtos.carro;

import solutis.elasticode.locadora_veiculo.entities.Acessorio;
import solutis.elasticode.locadora_veiculo.entities.ModeloCarro;

import java.math.BigDecimal;

public class CarroResponseResumed {

    private ModeloCarro modelo;
    private Acessorio acessorio;
    private BigDecimal valorDiaria;

    public CarroResponseResumed(ModeloCarro modelo, Acessorio acessorio, BigDecimal valorDiaria) {
        this.modelo = modelo;
        this.acessorio = acessorio;
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

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

}
