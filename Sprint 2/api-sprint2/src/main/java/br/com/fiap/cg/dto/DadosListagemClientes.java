package br.com.fiap.cg.dto;

import br.com.fiap.cg.model.Cliente;

public record DadosListagemClientes(
        Long id,
        String nome,
        String endereco,
        String telefone,
        String email

) {
    public DadosListagemClientes(Cliente cliente){
        this(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEndereco(),
                cliente.getTelefone(),
                cliente.getEmail()
        );
    }
}
