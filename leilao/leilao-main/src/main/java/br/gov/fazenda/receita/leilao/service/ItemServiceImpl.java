package br.gov.fazenda.receita.leilao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;

import br.gov.fazenda.receita.leilao.entity.Item;
//import br.gov.fazenda.receita.leilao.entity.Leilao;
import br.gov.fazenda.receita.leilao.repository.ItemRepository;
//import br.gov.fazenda.receita.leilao.repository.LeilaoRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository repo;

    //@Autowired
	//private LeilaoRepository leilaoRepo;
	
    @Override
	public Item buscarPorId(Long id) {
		Optional<Item> itemOp = repo.findById(id);
		return itemOp.get();
	}
	
    @Override
	public List<Item> buscarTodos() {
		return repo.findAll();
	}
	
    @Override
    public Item novoItem(Item item) {
        if(item == null) {
            throw new IllegalArgumentException("Parâmetros inválidos!");
        }
        return repo.save(item);
    }	
	   
    @Override
    public Item atualizarItem(Item item) {
    	return repo.save(item);
    }
    
    @Override
    public void excluirItem(Long id) {
    	repo.deleteById(id);
    }

    /*@Override
    public Item novoItem(String tipo, String nome, String descricao, Long idLote) {
        Optional<Leilao> leilaoOp = leilaoRepo.findById(idLote);
        if(leilaoOp.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lote inexistente!");
        }
        Item item = new Item(tipo, nome, descricao, leilaoOp.get());
       
        return repo.save(item);
    }*/

}
