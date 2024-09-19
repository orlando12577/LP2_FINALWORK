package com.example.lp2_finalwork.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Models.DispositivoInformatica;
import com.example.lp2_finalwork.Repository.DispositivoInformaticaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DispositivoInformaticaService {

    private final DispositivoInformaticaRepository dispositivoInformaticaRepository;
    
    @Autowired
    public DispositivoInformaticaService(DispositivoInformaticaRepository dispositivoInformaticaRepository) {
        this.dispositivoInformaticaRepository = dispositivoInformaticaRepository;
    }

    // Método para salvar um dispositivo de informática
    public DispositivoInformatica save(DispositivoInformatica dispositivo) {
        return dispositivoInformaticaRepository.save(dispositivo);
    }

    // Método para atualizar um dispositivo de informática
    public DispositivoInformatica update(DispositivoInformatica dispositivo) {
        return dispositivoInformaticaRepository.save(dispositivo); // Save também pode ser utilizado para atualização
    }

    // Método para deletar um dispositivo de informática pelo ID
    public void delete(int id) {
        dispositivoInformaticaRepository.deleteById(id);
    }

    // Método para encontrar um dispositivo de informática pelo ID
    public Optional<DispositivoInformatica> findById(int id) {
        return dispositivoInformaticaRepository.findById(id);
    }

    // Método para buscar todos os dispositivos de informática
    public List<DispositivoInformatica> findAll() {
        return dispositivoInformaticaRepository.findAll();
    }

    public DispositivoInformaticaRepository getDispositivoInformaticaRepository() {
        return dispositivoInformaticaRepository;
    }
}

