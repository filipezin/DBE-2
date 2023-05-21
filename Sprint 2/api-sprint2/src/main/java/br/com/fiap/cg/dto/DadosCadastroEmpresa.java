package br.com.fiap.cg.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroEmpresa(

        @NotBlank
        String nome,
        @NotBlank
        String endereco,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = ".+@.+\\.com", message = "O campo 'email' deve ter um formato válido de e-mail.")
        String email
) {
}
