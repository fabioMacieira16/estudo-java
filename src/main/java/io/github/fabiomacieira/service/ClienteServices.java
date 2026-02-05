package io.github.fabiomacieira.service;

import io.github.fabiomacieira.Model.Cliente;
import io.github.fabiomacieira.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices {

    private  ClienteRepository _repository;

    @Autowired
    public ClienteServices(ClienteRepository repository){
        this._repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this._repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //valida os dados do clientes
    }
}
