package br.gov.fazenda.receita.leilao.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fazenda.receita.leilao.entity.Item;
import br.gov.fazenda.receita.leilao.entity.Leilao;
import br.gov.fazenda.receita.leilao.repository.ItemRepository;
import br.gov.fazenda.receita.leilao.repository.LeilaoRepository;

@Service
public class LeilaoServiceImpl implements LeilaoService{

    @Autowired
    private LeilaoRepository leilaoRepo;

	@Autowired 
    private ItemRepository itemRepo;

    @Override
    public Leilao buscarLeilaoPorId(Long id) {
        Optional<Leilao> leilaoOp = leilaoRepo.findById(id);
        if(leilaoOp.isEmpty()){
            throw new IllegalArgumentException("Leilão não encontrado!");
        }
        return leilaoOp.get();
    }
    
	@Override
	public Leilao novoLeilao (Leilao leilao) {
	    if (leilao == null || 
	    		leilao.getDataInicial() == null || 
	    		leilao.getDataVisitacao() == null ||
	            leilao.getDescricao() == null || 
	            leilao.getDescricao() == "") {
	        throw new IllegalArgumentException("Parâmetros inválidos!");
	    }
	    return leilaoRepo.save(leilao);
	}

	@Override
	public Leilao novoLeilao (LocalDateTime dataInicial, LocalDate dataVisitacao,String descricao) {
	    if (dataInicial == null || 
	    	dataVisitacao == null || 
	    	descricao  == null || 
	    	descricao == "") {
	        throw new IllegalArgumentException("Parâmetros inválidos!");
	    }
	    Leilao leilao = new Leilao();
	    leilao.setDataInicial(dataInicial);
	    leilao.setDataVisitacao(dataVisitacao);
	    leilao.setDescricao(descricao);
	    return novoLeilao(leilao);
	}
	
	@Override
    public Leilao atualizarLeilao (Leilao leilao) {
    	return leilaoRepo.save(leilao);
    }
    
    @Override
    public void excluirLeilao (Long id) {
    	leilaoRepo.deleteById(id);    
    }

	@Override
    public List<Item> buscarItensPorLeilaoOrdenadosPorNome(Long idLeilao) {
        return itemRepo.findAllByLeilaoIdOrderByNome(idLeilao);
    }

	@Override
	public List<Leilao> buscarTodosLeiloesOrdenadosPorDataInicial() {
		return leilaoRepo.findAllByOrderByDataInicial();
	}
}