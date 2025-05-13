package solutis.elasticode.locadora_veiculo.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String placa;
    private String chassi;
    private String cor;
    private BigDecimal valorDiaria;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private ModeloCarro modelo;

    @OneToOne
    private Acessorio acessorio;

    public Carro(Integer id, String placa, String chassi, String cor, BigDecimal valorDiaria, ModeloCarro modelo, Acessorio acessorio) {
        this.id = id;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.valorDiaria = valorDiaria;
        this.modelo = modelo;
        this.acessorio = acessorio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
