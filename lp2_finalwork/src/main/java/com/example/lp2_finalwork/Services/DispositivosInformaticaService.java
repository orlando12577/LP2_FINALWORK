package com.example.lp2_finalwork.Services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Exceptions.DispositivosInformaticaTemLancesException;
import com.example.lp2_finalwork.Models.ClienteDispositivoInformatica;
import com.example.lp2_finalwork.Models.DispositivoInformatica;
import com.example.lp2_finalwork.Models.Leilao;
import com.example.lp2_finalwork.Models.TiposDi;
import com.example.lp2_finalwork.Repository.ClienteDispositivoInformaticaRepository;
import com.example.lp2_finalwork.Repository.DispositivosInformaticaRepository;
import com.example.lp2_finalwork.Repository.LeilaoRepository;
import com.example.lp2_finalwork.Repository.TiposDiRepository;
import com.example.lp2_finalwork.dtos.DispositivoInformaticaDto;
import com.example.lp2_finalwork.dtos.DispositivoInformaticaForm;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DispositivosInformaticaService {

  	
	@Autowired
	private DispositivosInformaticaRepository dispositivosInformaticaRepository;
	
	@Autowired
	private ClienteDispositivoInformaticaRepository clienteDispositivoInformaticaRepository;
	
	
	@Autowired
	private TiposDiRepository tipoDiRepository;
	
	@Autowired
	private LeilaoRepository leilaoRepository;
	
	public ResponseEntity<List<DispositivoInformaticaDto>> getAll(){
		List<DispositivoInformatica> dispositivoInformaticas= dispositivosInformaticaRepository.findAll();
		List<DispositivoInformaticaDto> dispositivoInformaticaDtos = new ArrayList<DispositivoInformaticaDto>();
		
		for (DispositivoInformatica dispositivoInformatica : dispositivoInformaticas) {
			dispositivoInformaticaDtos.add(converteParaDto(dispositivoInformatica));
		}
		return ResponseEntity.ok().body(dispositivoInformaticaDtos);
	}
	
	public ResponseEntity<DispositivoInformaticaDto> save(DispositivoInformaticaForm dispositivoInformaticaForm) {
		
		TiposDi tipoDi = tipoDiRepository.findById(dispositivoInformaticaForm.getTipoDi()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + dispositivoInformaticaForm.getTipoDi() + " na classe: " + TiposDi.class.toString()));
		
		Leilao leilao = leilaoRepository.findById(dispositivoInformaticaForm.getLeilao()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + dispositivoInformaticaForm.getLeilao() + " na classe: " + Leilao.class.toString()));
		
		LocalDateTime dataAtual = LocalDateTime.now();
		
		if(!dataAtual.isBefore(leilao.getLeiDataOcorrencia()))  {
			throw new DispositivosInformaticaTemLancesException("O leilão que está cadastrando no dispositivo de informática já encerrou !!!");
		}
		
		
		DispositivoInformatica dispositivoInformatica = new DispositivoInformatica(
				dispositivoInformaticaForm.getDiEnderecoFisico(),
				dispositivoInformaticaForm.getDiMarca(),
				dispositivoInformaticaForm.getDiProcessador(),
				dispositivoInformaticaForm.getDiTela(),
				dispositivoInformaticaForm.getDiArmazenamento(),
				dispositivoInformaticaForm.getDiMemoria(),
				dispositivoInformaticaForm.getDiTensao(),
				dispositivoInformaticaForm.getDiNumeroPortas(),
				tipoDi,
				leilao
				);
		
		
		return ResponseEntity.ok().body(converteParaDto(dispositivosInformaticaRepository.save(dispositivoInformatica)));
	}
	
	public ResponseEntity<DispositivoInformaticaDto>  update(DispositivoInformaticaForm dispositivoInformaticaForm, Integer id) {
		
		DispositivoInformatica dispositivoInformatica = dispositivosInformaticaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + id + " na classe: " + DispositivoInformatica.class.toString() ));                   
		
		List<ClienteDispositivoInformatica> lances = clienteDispositivoInformaticaRepository.findBydispositivoInformatica(dispositivoInformatica);
		
		Leilao leilao = leilaoRepository.findById(dispositivoInformaticaForm.getLeilao()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + dispositivoInformaticaForm.getLeilao() + " na classe: " + Leilao.class.toString()));
		
		
		
		if(!lances.isEmpty() && dispositivoInformatica.getLeilao().getLeiId() != dispositivoInformaticaForm.getLeilao()) {
			throw new DispositivosInformaticaTemLancesException("O dispositivo de informática que está tentando alterar o leilão já possui lances registrados!!!");
		}
		
		
		LocalDateTime dataAtual = LocalDateTime.now();
		
		if(dispositivoInformatica.getLeilao().getLeiDataOcorrencia() != leilao.getLeiDataOcorrencia() && !dataAtual.isBefore(leilao.getLeiDataOcorrencia()))  {
			throw new DispositivosInformaticaTemLancesException("O leilão que está cadastrando no dispositivo de informática já encerrou !!!");
		}
		
		TiposDi tipoDi = tipoDiRepository.findById(dispositivoInformaticaForm.getTipoDi()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + dispositivoInformaticaForm.getTipoDi() + " na classe: " + TiposDi.class.toString()));
		
		dispositivoInformatica.setDiArmazenamento(dispositivoInformaticaForm.getDiArmazenamento());
		dispositivoInformatica.setDiEnderecoFisico(dispositivoInformaticaForm.getDiEnderecoFisico());
		dispositivoInformatica.setDiMarca(dispositivoInformaticaForm.getDiMarca());
		dispositivoInformatica.setDiMemoria(dispositivoInformaticaForm.getDiMemoria());
		dispositivoInformatica.setDiNumeroPortas(dispositivoInformaticaForm.getDiNumeroPortas());
		dispositivoInformatica.setDiProcessador(dispositivoInformaticaForm.getDiProcessador());
		dispositivoInformatica.setDiTela(dispositivoInformaticaForm.getDiTela());
		dispositivoInformatica.setDiTensao(dispositivoInformaticaForm.getDiTensao());
		dispositivoInformatica.setTipoDi(tipoDi);
		dispositivoInformatica.setLeilao(leilao);
		
		return ResponseEntity.ok().body(converteParaDto(dispositivosInformaticaRepository.save(dispositivoInformatica)));
	}
	
	public void delete(Integer id) {
		
		dispositivosInformaticaRepository.deleteById(id);
	}
	
	public ResponseEntity<DispositivoInformaticaDto> getById(Integer id){
		return ResponseEntity.ok().body(converteParaDto(dispositivosInformaticaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + id + " na classe: " + DispositivoInformatica.class.toString()))));
	}
	
	private DispositivoInformaticaDto converteParaDto(DispositivoInformatica dispositivoInformatica) {
		return new DispositivoInformaticaDto(
				dispositivoInformatica.getDiId(),
				dispositivoInformatica.getDiEnderecoFisico(),
				dispositivoInformatica.getDiMarca(),
				dispositivoInformatica.getDiProcessador(),
				dispositivoInformatica.getDiTela(),
				dispositivoInformatica.getDiArmazenamento(),
				dispositivoInformatica.getDiMemoria(),
				dispositivoInformatica.getDiTensao(),
				dispositivoInformatica.getDiNumeroPortas(),
				dispositivoInformatica.getTipoDi().getTdiNome(),
				dispositivoInformatica.getLeilao().getLeiDataOcorrencia());
	}
	
}