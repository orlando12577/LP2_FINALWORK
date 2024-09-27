package com.example.lp2_finalwork.Controller;

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


import com.example.lp2_finalwork.Services.ClienteService;
import com.example.lp2_finalwork.dtos.ClienteDto;
import com.example.lp2_finalwork.dtos.ClienteForm;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins="*")
public class ClienteController {

	@Autowired
private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDto>> getAll() {

		return clienteService.getAll();
	}
	
	@PostMapping
	public ResponseEntity<ClienteDto> save(@RequestBody ClienteForm clienteForm) {
		
		
		return clienteService.save(clienteForm);
	}
	
	@PutMapping("/{cpf}")
	public ResponseEntity<ClienteDto> update(@RequestBody ClienteForm clienteForm, @PathVariable String cpf) {
		return clienteService.update(clienteForm, cpf);
	}
	
	@DeleteMapping("/{cpf}")
	public void delete(@PathVariable String cpf) {
		clienteService.delete(cpf);
	}
	
	@GetMapping("/{cpf}")
	public ResponseEntity<ClienteDto> getById(@PathVariable String cpf){
		return clienteService.getById(cpf);
	}
}
