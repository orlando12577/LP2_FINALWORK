package com.example.lp2_finalwork.Service;

import java.util.List;

import com.example.lp2_finalwork.entity.Financeira;



public interface FinanceiraService {

    public Financeira buscarFinanceiraPorId(Long id);
    
    public List<Financeira> buscarTodasFinanceiras();

    public Financeira novaFinanceira(Financeira financeira);
    
    public void excluirFinanceiraPorId(Long id);
    
}