package br.gov.fazenda.receita.leilao.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import br.gov.fazenda.receita.leilao.entity.Item;
import br.gov.fazenda.receita.leilao.entity.Leilao;

public interface LeilaoService {

    public Leilao buscarLeilaoPorId(Long id);
    
    public Leilao novoLeilao (Leilao leilao);
    
    public Leilao novoLeilao(LocalDateTime dataInicial, LocalDate dataVisitacao, String descricao);
    
    public Leilao atualizarLeilao (Leilao leilao);
    
    public void excluirLeilao (Long id);

    public List<Item> buscarItensPorLeilaoOrdenadosPorNome (Long id);

    public List<Leilao> buscarTodosLeiloesOrdenadosPorDataInicial();

}