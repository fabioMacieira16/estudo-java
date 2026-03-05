package io.github.fabiomacieir.clientes.model.repository;

import io.github.fabiomacieir.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServicoRepository extends JpaRepository<Cliente, Integer> {

}
