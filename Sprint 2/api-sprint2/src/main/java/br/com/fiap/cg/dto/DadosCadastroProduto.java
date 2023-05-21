package br.com.fiap.cg.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProduto(

        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotNull
        Double preco,
        @NotNull
        Long id_empresa

) {
}
