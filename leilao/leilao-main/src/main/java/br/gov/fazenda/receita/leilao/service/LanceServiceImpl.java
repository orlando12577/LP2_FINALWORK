package br.gov.fazenda.receita.leilao.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gov.fazenda.receita.leilao.entity.Lance;
import br.gov.fazenda.receita.leilao.repository.LanceRepository;

@Service
public class LanceServiceImpl implements LanceService {

    @Autowired
    private LanceRepository lanceRepo;

    @Override
    public Lance buscarLancePorId(Long id) {
        return lanceRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Lance não encontrado!"));
    }

    @Override
    public Lance novoLance(Lance lance) {
        if (lance == null || lance.getValorLance() == null || lance.getItem() == null || lance.getUsuario() == null) {
            throw new IllegalArgumentException("Parâmetros inválidos!");
        }
        return lanceRepo.save(lance);
    }

    @Override
    public Lance atualizarLance(Long id, Lance lance) {
        Lance existente = buscarLancePorId(id);
        existente.setValorLance(lance.getValorLance());
        existente.setItem(lance.getItem());
        existente.setUsuario(lance.getUsuario());
        return lanceRepo.save(existente);
    }

    @Override
    public void excluirLance(Long id) {
        buscarLancePorId(id);
        lanceRepo.deleteById(id);
    }

    @Override
    public List<Lance> buscarTodosLancesOrdenadosPorDataHora() {
        return lanceRepo.findAllByOrderByDatahoraAsc();
    }
}
