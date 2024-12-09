package com.example.lp2_finalwork.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Repository.FinanceiraRepository;
import com.example.lp2_finalwork.Service.FinanceiraService;
import com.example.lp2_finalwork.entity.Financeira;

@Service
public class FinanceiraServiceImpl implements FinanceiraService{

    @Autowired
    private FinanceiraRepository financeiraRepo;
    
    @Override
    public Financeira buscarFinanceiraPorId(Long id) {
        Optional<Financeira> financeiraOp = financeiraRepo.findById(id);
        if(financeiraOp.isEmpty()){
            throw new IllegalArgumentException("Financeira não encontrada!");
        }
        return financeiraOp.get();
    }

    @Override
    public List<Financeira> buscarTodasFinanceiras(){
        return financeiraRepo.findAll();
    }

    public Financeira novaFinanceira(Financeira financeira){
        if(financeira == null ||
                financeira.getCnpj() == null ||
                financeira.getNome() == null ||
                financeira.getNome().isBlank() ||
                financeira.getRazaoSocial() == null ||
                financeira.getRazaoSocial().isBlank() ||
                financeira.getEmail() == null ||
                financeira.getEmail().isBlank() ||
                financeira.getTelefone() == null ||
                financeira.getTelefone().isBlank()) {
            throw new IllegalArgumentException("Financeira com atributos inválidos!");
        }

        financeira = financeiraRepo.save(financeira);

        return financeira;
    }

    @Override
    public void excluirFinanceiraPorId(Long id) {
        Optional<Financeira> financeiraOp = financeiraRepo.findById(id);
        if(financeiraOp.isEmpty()){
            throw new IllegalArgumentException("Financeira não encontrada!");
        }
        financeiraRepo.deleteById(id);
    }
    
}