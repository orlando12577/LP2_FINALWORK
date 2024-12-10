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
        Optional<Lance> lanceOp = lanceRepo.findById(id);
        if (lanceOp.isEmpty()) {
            throw new IllegalArgumentException("Lance não encontrado!");
        }
        return lanceOp.get();
    }

    @Override
    public Lance novoLance(Lance lance) {
        if (lance == null || lance.getValorLance() == null || lance.getItem() == null || lance.getUsuario() == null) {
            throw new IllegalArgumentException("Parâmetros inválidos!");
        }
        return lanceRepo.save(lance);
    }

    @Override
    public Lance atualizarLance(Lance lance) {
        return lanceRepo.save(lance);
    }

    @Override
    public void excluirLance(Long id) {
        lanceRepo.deleteById(id);
    }

    @Override
    public List<Lance> buscarLancesPorItem(Long itemId) {
        return lanceRepo.findByItemId(itemId);
    }

    @Override
    public List<Lance> buscarLancesPorUsuario(Long usuarioId) {
        return lanceRepo.findByUsuarioId(usuarioId);
    }

    @Override
    public List<Lance> buscarTodosLancesOrdenadosPorDataHora() {
        return lanceRepo.findAllByOrderByDatahoraAsc();
    }
}
