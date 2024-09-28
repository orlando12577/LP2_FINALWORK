package com.example.lp2_finalwork.Controller;


import com.example.lp2_finalwork.Services.ClienteVeiculoService;
import com.example.lp2_finalwork.dtos.ClienteVeiculoDto;
import com.example.lp2_finalwork.dtos.ClienteVeiculoForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/lanceVeiculos")
@CrossOrigin(origins="*")
public class ClienteVeiculoController {
    @Autowired
	private ClienteVeiculoService clienVeiculoService;
	
	@GetMapping
	public ResponseEntity<List<ClienteVeiculoDto>> getAll() {
		return clienVeiculoService.getAll();
	}
	
	@PostMapping
	public ResponseEntity<ClienteVeiculoDto> save(@RequestBody ClienteVeiculoForm clienteVeiculoForm) {
		
		
		return clienVeiculoService.save(clienteVeiculoForm);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ClienteVeiculoDto> update(@RequestBody ClienteVeiculoForm clienteVeiculoForm, @PathVariable Integer id) {
		return clienVeiculoService.update(clienteVeiculoForm, id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		clienVeiculoService.delete(id);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClienteVeiculoDto> getById(@PathVariable Integer id){
		return clienVeiculoService.getById(id);
	}

}
