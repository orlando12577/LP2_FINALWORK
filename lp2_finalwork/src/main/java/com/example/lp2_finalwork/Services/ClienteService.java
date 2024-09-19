package com.example.lp2_finalwork.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Models.Cliente;
import com.example.lp2_finalwork.Repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente update(Cliente cliente) {
        if(clienteRepository.existsById(cliente.getCliCpf())) {
            return clienteRepository.save(cliente);
        }
        throw new RuntimeException("Cliente não encontrado");
    }

    public void delete(String cliCpf) {
        clienteRepository.deleteById(cliCpf);
    }

    public Optional<Cliente> findById(String cliCpf) {
        return clienteRepository.findById(cliCpf);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
}

