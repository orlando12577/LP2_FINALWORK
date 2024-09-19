package com.example.lp2_finalwork.Services;

import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Models.EntidadeFinanceira;
import com.example.lp2_finalwork.Repository.EntidadeFinanceiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class EntidadeFinanceiraService {

    @Autowired
    private EntidadeFinanceiraRepository entidadeFinanceiraRepository;

    public EntidadeFinanceira save(EntidadeFinanceira entidadeFinanceira) {
        return entidadeFinanceiraRepository.save(entidadeFinanceira);
    }

    public EntidadeFinanceira update(EntidadeFinanceira entidadeFinanceira) {
        if (entidadeFinanceiraRepository.existsById(entidadeFinanceira.getEntidadefinId())) {
            return entidadeFinanceiraRepository.save(entidadeFinanceira);
        }
        throw new RuntimeException("Entidade financeira não encontrada");
    }

    public void delete(int entidadefinId) {
        entidadeFinanceiraRepository.deleteById(entidadefinId);
    }

    public Optional<EntidadeFinanceira> findById(int entidadefinId) {
        return entidadeFinanceiraRepository.findById(entidadefinId);
    }

    public List<EntidadeFinanceira> findAll() {
        return entidadeFinanceiraRepository.findAll();
    }
}

    

