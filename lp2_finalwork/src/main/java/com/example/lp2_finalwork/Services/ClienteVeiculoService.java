package com.example.lp2_finalwork.Services;

import com.example.lp2_finalwork.Models.ClienteVeiculos;
import com.example.lp2_finalwork.Repository.ClienteVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteVeiculoService {

    @Autowired
    private ClienteVeiculoRepository clienteVeiculoRepository;

    // Método para salvar ClienteVeiculo
    public ClienteVeiculos save(ClienteVeiculos clienteVeiculos) {
        return clienteVeiculoRepository.save(clienteVeiculos);
    }

    // Método para atualizar ClienteVeiculo
    public ClienteVeiculos update(ClienteVeiculos clienteVeiculos) {
        if (clienteVeiculoRepository.existsById(clienteVeiculos.getCliveiId())) {
            return clienteVeiculoRepository.save(clienteVeiculos);
        }
        throw new RuntimeException("ClienteVeiculo não encontrado");
    }

    // Método para deletar ClienteVeiculo pelo ID
    public void delete(int clienteVeiculoId) {
        clienteVeiculoRepository.deleteById(clienteVeiculoId);
    }

    // Método para encontrar ClienteVeiculo pelo ID
    public Optional<ClienteVeiculos> findById(int clienteVeiculoId) {
        return clienteVeiculoRepository.findById(clienteVeiculoId);
    }

    // Método para listar todos os ClienteVeiculo
    public List<ClienteVeiculos> findAll() {
        return clienteVeiculoRepository.findAll();
    }
}

