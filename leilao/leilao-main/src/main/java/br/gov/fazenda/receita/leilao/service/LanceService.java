package br.gov.fazenda.receita.leilao.service;

import java.util.List;

import br.gov.fazenda.receita.leilao.entity.Lance;

public interface LanceService {

    public Lance buscarLancePorId(Long id);
    
    public Lance novoLance(Lance lance);
    
    public Lance atualizarLance(Lance lance);
    
    public void excluirLance(Long id);

    public List<Lance> buscarLancesPorItem(Long itemId);

    public List<Lance> buscarLancesPorUsuario(Long usuarioId);

    public List<Lance> buscarTodosLancesOrdenadosPorDataHora();
}
