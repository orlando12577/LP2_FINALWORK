package com.example.lp2_finalwork.Services;

import com.example.lp2_finalwork.Models.ClienteDispositivoInformatica;
import com.example.lp2_finalwork.Repository.ClienteDispositivoInformaticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteDIspositivoInformativaService {

    @Autowired
    private ClienteDispositivoInformaticaRepository clienteDispositivoInformaticaRepository;

    // Método para salvar ClienteDispositivoInformatica
    public ClienteDispositivoInformatica save(ClienteDispositivoInformatica clienteDispositivoInformatica) {
        return clienteDispositivoInformaticaRepository.save(clienteDispositivoInformatica);
    }

    // Método para atualizar ClienteDispositivoInformatica
    public ClienteDispositivoInformatica update(ClienteDispositivoInformatica clienteDispositivoInformatica) {
        if (clienteDispositivoInformaticaRepository.existsById(clienteDispositivoInformatica.getClidiId())) {
            return clienteDispositivoInformaticaRepository.save(clienteDispositivoInformatica);
        }
        throw new RuntimeException("ClienteDispositivoInformatica não encontrado");
    }

    // Método para deletar ClienteDispositivoInformatica pelo ID
    public void delete(int clienteDispositivoId) {
        clienteDispositivoInformaticaRepository.deleteById(clienteDispositivoId);
    }

    // Método para encontrar ClienteDispositivoInformatica pelo ID
    public Optional<ClienteDispositivoInformatica> findById(int clienteDispositivoId) {
        return clienteDispositivoInformaticaRepository.findById(clienteDispositivoId);
    }

    // Método para listar todos os ClienteDispositivoInformatica
    public List<ClienteDispositivoInformatica> findAll() {
        return clienteDispositivoInformaticaRepository.findAll();
    }
}
