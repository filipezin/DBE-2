package br.com.fiap.cg.model;

import br.com.fiap.cg.dto.DadosAtualizacaoCliente;
import br.com.fiap.cg.dto.DadosCadastroCliente;
import jakarta.persistence.*;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private Boolean ativo;

	// ---------------------------------------- //

	public Cliente() {
	}

	public Cliente(DadosCadastroCliente dados) {
		this.nome = dados.nome();
		this.endereco = dados.endereco();
		this.telefone = dados.telefone();
		this.email = dados.email();
		this.ativo = true;
	}

	// ---------------------------------------- //

	public void atualizarInfo(DadosAtualizacaoCliente dados) {
		if (dados.nome() != null) {
			this.nome = dados.nome();
		}
		if (dados.endereco() != null) {
			this.endereco = dados.endereco();
		}
		if (dados.telefone() != null) {
			this.telefone = dados.telefone();
		}
		if (dados.email() != null) {
			this.email= dados.email();
		}

	}
	
	public void excluir() {
		this.ativo = false;
	}

	public Long getId() {
		return id;
	}

	public Cliente setId(Long id) {
		this.id = id;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Cliente setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getEndereco() {
		return endereco;
	}

	public Cliente setEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}

	public String getTelefone() {
		return telefone;
	}

	public Cliente setTelefone(String telefone) {
		this.telefone = telefone;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Cliente setEmail(String email) {
		this.email = email;
		return this;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public Cliente setAtivo(Boolean ativo) {
		this.ativo = ativo;
		return this;
	}
}
