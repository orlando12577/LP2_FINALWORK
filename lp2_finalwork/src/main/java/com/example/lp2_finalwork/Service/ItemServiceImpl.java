package com.example.lp2_finalwork.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.entity.Item;


@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private com.example.lp2_finalwork.Repository.ItemRepository repo;

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