package solutis.elasticode.locadora_veiculo.entities;

import jakarta.persistence.*;
import solutis.elasticode.locadora_veiculo.enums.Categoria;

@Entity
public class ModeloCarro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;

    @OneToOne
    @JoinColumn(name = "fabricante_id")
    private Fabricante fabricante;

    @Enumerated
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public ModeloCarro(Integer id, String descricao, Fabricante fabricante, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
