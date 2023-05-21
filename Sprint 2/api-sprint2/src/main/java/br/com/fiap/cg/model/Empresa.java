package br.com.fiap.cg.model;


import br.com.fiap.cg.dto.DadosCadastroEmpresa;
import jakarta.persistence.*;

@Entity(name = "EMPRESA")
@Table(name = "TB_EMPRESA")
public class Empresa {

    @Id
    @SequenceGenerator(name = "SQ_EMPRESA", sequenceName = "SQ_EMPRESA", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMPRESA")
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Boolean ativo;

    // ---------------------------------------- //


    public Empresa() {
    }

    public Empresa(DadosCadastroEmpresa dados) {
        this.nome = dados.nome();
        this.endereco = dados.endereco();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.ativo = true;
    }

    // ---------------------------------------- //

    public void excluir() {
    	this.ativo = false;
    }
    
    public Long getId() {
        return id;
    }

    public Empresa setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Empresa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Empresa setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Empresa setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Empresa setEmail(String email) {
        this.email = email;
        return this;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Empresa setAtivo(Boolean ativo) {
        this.ativo = ativo;
        return this;
    }
}
