package br.gov.fazenda.receita.leilao.service;

import java.util.List;

import br.gov.fazenda.receita.leilao.entity.Financeira;

public interface FinanceiraService {

    public Financeira buscarFinanceiraPorId(Long id);
    
    public List<Financeira> buscarTodasFinanceiras();

    public Financeira novaFinanceira(Financeira financeira);
    
    public void excluirFinanceiraPorId(Long id);
    
}
