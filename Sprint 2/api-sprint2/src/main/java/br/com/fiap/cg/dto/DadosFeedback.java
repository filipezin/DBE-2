package br.com.fiap.cg.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosFeedback(

        @NotBlank
        String produto,
        @NotNull
        Double preco,
        @NotBlank
        String comentario,
        @NotNull
        Integer qualidade_produto,
        @NotNull
        Integer atendimento,
        @NotNull
        Boolean recomendacao

) {
}
