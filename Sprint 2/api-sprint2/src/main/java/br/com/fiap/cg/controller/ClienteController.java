package br.com.fiap.cg.controller;


import br.com.fiap.cg.dto.DadosCadastroCliente;
import br.com.fiap.cg.dto.DadosListagemClientes;
import br.com.fiap.cg.model.Cliente;
import br.com.fiap.cg.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repo;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados){
        repo.save(new Cliente(dados));
    }

    @PutMapping
    @Transactional
    public Page<DadosListagemClientes> listar(@PageableDefault(sort = {"nome"}, size = 10)Pageable paginacao){
        return repo.findAllByAtivoTrue(paginacao).map(DadosListagemClientes::new);
    }

    public void excluir(@PathVariable Long id){
        Cliente cliente = new Cliente();
        cliente = repo.getReferenceById(id);
        cliente.excluir();
    }




}
