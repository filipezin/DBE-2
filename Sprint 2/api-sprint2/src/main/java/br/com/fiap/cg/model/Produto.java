package br.com.fiap.cg.model;


import br.com.fiap.cg.dto.DadosCadastroProduto;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    @SequenceGenerator(name = "SQ_PRODUTO", sequenceName = "SQ_PRODUTO", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTO")
    @Column(name = "ID_PRODUTO")
    private Long id;
    private Long id_empresa;
    private String nome;
    private String descricao;
    private Double preco;



    // ---------------------------------------- //

    public Produto() {
    }

    public Produto(DadosCadastroProduto dados) {
        this.id_empresa = dados.id_empresa();
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
    }

    // ---------------------------------------- //

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public Produto setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Double getPreco() {
        return preco;
    }

    public Produto setPreco(Double preco) {
        this.preco = preco;
        return this;
    }
}
