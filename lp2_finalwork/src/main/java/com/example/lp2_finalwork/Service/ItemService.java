package com.example.lp2_finalwork.Service;

import java.util.List;

import com.example.lp2_finalwork.entity.Item;

public interface ItemService {

	public Item buscarPorId(Long id);
	
	public List<Item> buscarTodos();

	public Item novoItem(Item item);
	
	
	public Item atualizarItem(Item item);
	
	public void excluirItem(Long id);

}