package br.gov.fazenda.receita.leilao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fazenda.receita.leilao.entity.Item;
import br.gov.fazenda.receita.leilao.service.ItemService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin
@RequestMapping(value = "/item")

public class ItemController {
	
	@Autowired
	private ItemService service;
	
    @GetMapping
    @Operation(summary = "BUSCAR ITENS", description = "BUSCAR TODOS ITENS", tags = {"/item" })
    public List<Item> buscarTodos() {
        return service.buscarTodos();
    }
	
	@GetMapping(value="/{id}")
	@Operation(summary = "BUSCAR ITEM", description = "BUSCAR ITEM POR ID", tags = {"/item" })
	public ResponseEntity<Item> buscarPorId(@PathVariable Long id)  {
		Item obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}	
	
	@PostMapping
	@Operation(summary = "INSERIR ITEM", description = "INSERIR NOVO ITEM", tags = {"/item" })
    public Item novoItem(@RequestBody Item item) {
        return service.novoItem(item);
    }
	
	@PutMapping(value="/{id}")
	@Operation(summary = "ATUALIZAR ITEM", description = "ATUALIZAR ITEM PELO ID", tags = {"/item" })
	public ResponseEntity<Void> atualizarItem(@RequestBody Item item,@PathVariable Long id){
		item.setId(id);
		item = service.atualizarItem(item);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(value="/{id}")
	@Operation(summary = "DELETAR ITEM", description = "DELETAR ITEM PELO ID", tags = {"/item" })
	public ResponseEntity<Void> excluirItem(@PathVariable Long id)  {
		service.excluirItem(id);
		return ResponseEntity.noContent().build();
	}
	
}