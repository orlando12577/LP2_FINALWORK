package br.gov.fazenda.receita.leilao.service;

import java.util.List;

import br.gov.fazenda.receita.leilao.entity.Item;

public interface ItemService {

	public Item buscarPorId(Long id);
	
	public List<Item> buscarTodos();

	public Item novoItem(Item item);
	
	//public Item novoItem(String tipo, String nome, String descricao);

	//public Item novoItem(String tipo, String nome, String descricao, Long idLote);
	
	public Item atualizarItem(Item item);
	
	public void excluirItem(Long id);

}
