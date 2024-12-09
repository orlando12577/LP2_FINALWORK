package com.example.lp2_finalwork.Service;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.lp2_finalwork.entity.Item;
import com.example.lp2_finalwork.entity.Leilao;




public interface LeilaoService {

    public Leilao buscarLeilaoPorId(Long id);
    
    public Leilao novoLeilao (Leilao leilao);
    
    public Leilao novoLeilao(LocalDateTime dataInicial, LocalDate dataVisitacao, String descricao);
    
    public Leilao atualizarLeilao (Leilao leilao);
    
    public void excluirLeilao (Long id);

    public List<Item> buscarItensPorLeilaoOrdenadosPorNome (Long id);

    public List<Leilao> buscarTodosLeiloesOrdenadosPorDataInicial();

}