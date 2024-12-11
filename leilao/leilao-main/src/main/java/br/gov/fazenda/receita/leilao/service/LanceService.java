package br.gov.fazenda.receita.leilao.service;

import java.util.List;
import br.gov.fazenda.receita.leilao.entity.Lance;

public interface LanceService {
    Lance buscarLancePorId(Long id);
    Lance novoLance(Lance lance);
    Lance atualizarLance(Long id, Lance lance);
    void excluirLance(Long id);
    List<Lance> buscarTodosLancesOrdenadosPorDataHora();
}
