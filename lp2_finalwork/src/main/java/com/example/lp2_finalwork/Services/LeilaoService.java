package com.example.lp2_finalwork.Services;



import com.example.lp2_finalwork.Models.Leilao;
import com.example.lp2_finalwork.Repository.LeilaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeilaoService {

    @Autowired
    private LeilaoRepository leilaoRepository;

    // Método para salvar Leilao
    public Leilao save(Leilao leilao) {
        return leilaoRepository.save(leilao);
    }

    // Método para atualizar Leilao
    public Leilao update(Leilao leilao) {
        if (leilaoRepository.existsById(leilao.getLeilaoId())) {
            return leilaoRepository.save(leilao);
        }
        throw new RuntimeException("Leilao não encontrado");
    }

    // Método para deletar Leilao pelo ID
    public void delete(int leilaoId) {
        leilaoRepository.deleteById(leilaoId);
    }

    // Método para encontrar Leilao pelo ID
    public Optional<Leilao> findById(int leilaoId) {
        return leilaoRepository.findById(leilaoId);
    }

    // Método para listar todos os Leilao
    public List<Leilao> findAll() {
        return leilaoRepository.findAll();
    }
}
