package br.com.fiap.cg.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
		@NotNull
		Long id,
		String nome,
		String endereco,
		String telefone,
		String email
		) {

}
