package solutis.elasticode.locadora_veiculo.dtos.aluguel;

import solutis.elasticode.locadora_veiculo.entities.ApoliceSeguro;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

public class AluguelRequest {

    private Calendar dataPedido;
    private LocalDate dataDevolucao;
    private BigDecimal valorTotal;
    private ApoliceSeguro seguro;

    public AluguelRequest(Calendar dataPedido, LocalDate dataDevolucao, BigDecimal valorTotal, ApoliceSeguro seguro) {
        this.dataPedido = dataPedido;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.seguro = seguro;
    }

    public Calendar getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Calendar dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ApoliceSeguro getSeguro() {
        return seguro;
    }

    public void setSeguro(ApoliceSeguro seguro) {
        this.seguro = seguro;
    }

}
