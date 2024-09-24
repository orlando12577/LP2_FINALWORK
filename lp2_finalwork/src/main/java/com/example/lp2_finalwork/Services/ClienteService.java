package com.example.lp2_finalwork.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Exceptions.ClienteJaCadastradoException;
import com.example.lp2_finalwork.Models.Cliente;
import com.example.lp2_finalwork.Repository.ClienteRepository;
import com.example.lp2_finalwork.dtos.ClienteDto;
import com.example.lp2_finalwork.dtos.ClienteForm;

import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public ResponseEntity<List<ClienteDto>> getAll(){
		List<Cliente> clientes= clienteRepository.findAll();
		List<ClienteDto> clienteDtos = new ArrayList<ClienteDto>();
		
		for (Cliente cliente : clientes) {
			clienteDtos.add(converteParaDto(cliente));
		}
		return ResponseEntity.ok().body(clienteDtos);
	}
	
	public ResponseEntity<ClienteDto> save(ClienteForm clienteForm)  {
		
		Cliente cliente = clienteRepository.findBycliCpf(clienteForm.getCliCpf()); 
		
		if(cliente != null) {
			throw new ClienteJaCadastradoException("Já existe cliente cadastrado com o cpf: " + clienteForm.getCliCpf());
		}

		Cliente clienteNovo = new Cliente(
				clienteForm.getCliCpf(),
				clienteForm.getCliNome(),
				clienteForm.getCliEmail()
				);
		
		
		return ResponseEntity.ok().body(converteParaDto(clienteRepository.save(clienteNovo)));
	}
	
	public ResponseEntity<ClienteDto>  update(ClienteForm clienteForm, String cpf) {
		
		Cliente cliente = clienteRepository.findBycliCpf(cpf);                    
		

		cliente.setCliNome(clienteForm.getCliNome());
		cliente.setCliEmail(clienteForm.getCliEmail());

		
		
		return ResponseEntity.ok().body(converteParaDto(clienteRepository.save(cliente)));
	}
	
	@Transactional
	public void delete(String cpf) {
		
		clienteRepository.deleteBycliCpf(cpf);
	}
	
	public ResponseEntity<ClienteDto> getById(String cpf){
		return ResponseEntity.ok().body(converteParaDto(clienteRepository.findBycliCpf(cpf)));
	}
	
	public ClienteDto converteParaDto(Cliente Cliente) {
		return new ClienteDto(Cliente.getCliCpf(), Cliente.getCliNome(), Cliente.getCliEmail());
	}
}


