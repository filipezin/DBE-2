package br.com.fiap.cg.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cg.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Page<Cliente> findAllByAtivoTrue(Pageable pagina);
}
