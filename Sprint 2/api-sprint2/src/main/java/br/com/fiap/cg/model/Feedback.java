package br.com.fiap.cg.model;

import br.com.fiap.cg.dto.DadosFeedback;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_FEEDBACK")
public class Feedback {


    @Id
    @SequenceGenerator(name = "SQ_FEEDBACK", sequenceName = "SQ_FEEDBACK", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FEEDBACK")
    @Column(name = "ID_FEEDBACK")
    private Long id;
    
    private String produto;
    private String comentario;
    private Integer qualidade_produto;
    private Integer atendimento;
    private Double preco;
    private Boolean recomendacao;

    // ---------------------------------------- //

    public Feedback() {
    }

    public Feedback(DadosFeedback dados) {
        this.produto = dados.produto();
        this.comentario = dados.comentario();
        this.qualidade_produto = dados.qualidade_produto();
        this.atendimento = dados.atendimento();
        this.preco = dados.preco();
        this.recomendacao = dados.recomendacao();
    }

    // ---------------------------------------- //

    public Long getId() {
        return id;
    }

    public Feedback setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProduto() {
        return produto;
    }

    public Feedback setProduto(String produto) {
        this.produto = produto;
        return this;
    }

    public String getComentario() {
        return comentario;
    }

    public Feedback setComentario(String comentario) {
        this.comentario = comentario;
        return this;
    }

    public Integer getQualidade_produto() {
        return qualidade_produto;
    }

    public Feedback setQualidade_produto(Integer qualidade_produto) {
        this.qualidade_produto = qualidade_produto;
        return this;
    }

    public Integer getAtendimento() {
        return atendimento;
    }

    public Feedback setAtendimento(Integer atendimento) {
        this.atendimento = atendimento;
        return this;
    }

    public Double getPreco() {
        return preco;
    }

    public Feedback setPreco(Double preco) {
        this.preco = preco;
        return this;
    }

    public Boolean getRecomendacao() {
        return recomendacao;
    }

    public Feedback setRecomendacao(Boolean recomendacao) {
        this.recomendacao = recomendacao;
        return this;
    }
}
