package com.example.lp2_finalwork.Services;

import com.example.lp2_finalwork.Models.Cliente;
import com.example.lp2_finalwork.Models.ClienteDispositivoInformatica;
import com.example.lp2_finalwork.Models.DispositivoInformatica;
import com.example.lp2_finalwork.Repository.ClienteDispositivoInformaticaRepository;
import com.example.lp2_finalwork.Repository.ClienteRepository;
import com.example.lp2_finalwork.Repository.DispositivosInformaticaRepository;
import com.example.lp2_finalwork.dtos.ClienteDispositivoInformaticaDto;
import com.example.lp2_finalwork.dtos.ClienteDispositivoInformaticaForm;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteDIspositivoInformativaService {
@Autowired
	private ClienteDispositivoInformaticaRepository clienteDispositivosInformaticaRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private DispositivosInformaticaRepository dispositivosInformaticaRepository;
	

	
	public ResponseEntity<List<ClienteDispositivoInformaticaDto>> getAll(){
		List<ClienteDispositivoInformatica> cliDispositivoInformaticas = clienteDispositivosInformaticaRepository.findAll();
		
		List<ClienteDispositivoInformaticaDto> clientesdispositivoInformaticaDtos = new ArrayList<ClienteDispositivoInformaticaDto>();
		
		for (ClienteDispositivoInformatica clienteDispositivoInformatica : cliDispositivoInformaticas) {
			clientesdispositivoInformaticaDtos.add(converteParaDto(clienteDispositivoInformatica));
		}
		return ResponseEntity.ok().body(clientesdispositivoInformaticaDtos);
	}
	
	public ResponseEntity<ClienteDispositivoInformaticaDto> save(ClienteDispositivoInformaticaForm clienteDispositivoInformaticaForm) {
		
		Cliente cliente = clienteRepository.findBycliCpf(clienteDispositivoInformaticaForm.getCpfCliente());
		
		DispositivoInformatica dispositivoInformatica = dispositivosInformaticaRepository.findById(clienteDispositivoInformaticaForm.getDispositivoInformatica()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + clienteDispositivoInformaticaForm.getDispositivoInformatica() + " na classe: " + DispositivoInformatica.class.toString() ));

		ClienteDispositivoInformatica clienteDispositivoInformatica = new ClienteDispositivoInformatica(
				clienteDispositivoInformaticaForm.getValor(),
				cliente,
				dispositivoInformatica
				);
		
		
		return ResponseEntity.ok().body(converteParaDto(clienteDispositivosInformaticaRepository.save(clienteDispositivoInformatica)));
	}
	
	public ResponseEntity<ClienteDispositivoInformaticaDto>  update(ClienteDispositivoInformaticaForm clienteDispositivoInformaticaForm, Integer id) {
		
		ClienteDispositivoInformatica clienteDispositivoInformatica = clienteDispositivosInformaticaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + id + " na classe: " + ClienteDispositivoInformatica.class.toString() ));                   
		
		Cliente cliente = clienteRepository.findBycliCpf(clienteDispositivoInformaticaForm.getCpfCliente());
		
		DispositivoInformatica dispositivoInformatica = dispositivosInformaticaRepository.findById(clienteDispositivoInformaticaForm.getDispositivoInformatica()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + clienteDispositivoInformaticaForm.getDispositivoInformatica() + " na classe: " + DispositivoInformatica.class.toString() ));

		clienteDispositivoInformatica.setClidiValorLance(clienteDispositivoInformaticaForm.getValor());
		clienteDispositivoInformatica.setCliente(cliente);
		clienteDispositivoInformatica.setDispositivoInformatica(dispositivoInformatica);
		
		
		return ResponseEntity.ok().body(converteParaDto(clienteDispositivosInformaticaRepository.save(clienteDispositivoInformatica)));
	}
	
	public void delete(Integer id) {
		
		clienteDispositivosInformaticaRepository.deleteById(id);
	}
	
	public ResponseEntity<ClienteDispositivoInformaticaDto> getById(Integer id){
		return ResponseEntity.ok().body(converteParaDto(clienteDispositivosInformaticaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + id + " na classe: " + ClienteDispositivoInformatica.class.toString()))));
	}
	
	public ClienteDispositivoInformaticaDto converteParaDto(ClienteDispositivoInformatica clienteDispositivoInformatica) {
		return new ClienteDispositivoInformaticaDto(
				clienteDispositivoInformatica.getClidiId(),
				clienteDispositivoInformatica.getClidiValorLance(),
				clienteDispositivoInformatica.getCliente().getCliNome(),
				clienteDispositivoInformatica.getCliente().getCliCpf(),
				clienteDispositivoInformatica.getDispositivoInformatica().getDiId()
		);
	}
}
