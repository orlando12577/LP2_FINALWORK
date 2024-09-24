package com.example.lp2_finalwork.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Exceptions.DispositivosInformaticaTemLancesException;
import com.example.lp2_finalwork.Models.ClienteVeiculos;
import com.example.lp2_finalwork.Models.Leilao;
import com.example.lp2_finalwork.Models.TiposVeiculos;
import com.example.lp2_finalwork.Models.Veiculos;
import com.example.lp2_finalwork.Repository.ClienteVeiculoRepository;
import com.example.lp2_finalwork.Repository.LeilaoRepository;
import com.example.lp2_finalwork.Repository.TiposVeiculosRepository;
import com.example.lp2_finalwork.Repository.VeiculosRepository;
import com.example.lp2_finalwork.dtos.VeiculosDto;
import com.example.lp2_finalwork.dtos.VeiculosForm;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

@Service
public class VeiculosService {
       
   
	@Autowired
    private VeiculosRepository veiculosRepository;
    
    @Autowired
    private TiposVeiculosRepository tiposVeiculosRepository;
    
    @Autowired
    private LeilaoRepository leilaoRepository;
    
    @Autowired
    private ClienteVeiculoRepository clienteVeiculoRepository;


    public ResponseEntity<List<VeiculosDto>> getAll() {
        List<Veiculos> veiculo = veiculosRepository.findAll();
        List<VeiculosDto> veiculosDto = new ArrayList<VeiculosDto>();

        for (Veiculos veiculos : veiculo) {
            veiculosDto.add(converteParaDto(veiculos));
        }
        return ResponseEntity.ok().body(veiculosDto);

    }


    public ResponseEntity<VeiculosDto> getById(Integer id) {

        return ResponseEntity.ok().body(converteParaDto(veiculosRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + id + " na classe: " + Veiculos.class.toString()))));

    }


    public ResponseEntity<VeiculosDto> save(VeiculosForm veiculosForm) {
    	
    	TiposVeiculos tiposVeiculos = tiposVeiculosRepository.findById(veiculosForm.getTipoVeiculo()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + veiculosForm.getTipoVeiculo() + " na classe: " + TiposVeiculos.class.toString()));
    	
    	Leilao leilao = leilaoRepository.findById(veiculosForm.getLeilao()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + veiculosForm.getLeilao() + " na classe: " + Leilao.class.toString()));
    	
    	LocalDateTime dataAtual = LocalDateTime.now();
    	
    	if(!dataAtual.isBefore(leilao.getLeiDataOcorrencia()))  {
			throw new DispositivosInformaticaTemLancesException("O leilão que está cadastrando no dispositivo de informática já encerrou !!!");
		}
    	
        Veiculos veiculos = new Veiculos(
        		veiculosForm.getVeiPlaca(),
        		veiculosForm.getVeiMarca(),
        		veiculosForm.getVeiAnoFabricacao(),
        		veiculosForm.getVeiDistanciaRodada(),
        		veiculosForm.getVeiCambio(),
        		veiculosForm.getVeiCor(),
        		veiculosForm.getVeiCor(),
        		veiculosForm.getVeiPeso(),
        		tiposVeiculos,
        		leilao
        );
        return ResponseEntity.ok().body(converteParaDto(veiculosRepository.save(veiculos)));


    }

    public ResponseEntity<VeiculosDto> update(VeiculosForm veiculosForm, Integer id) {
    	
    	Veiculos veiculos  = veiculosRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + id + " na classe: " + Veiculos.class.toString() ));                   
		
		Leilao leilao = leilaoRepository.findById(veiculosForm.getLeilao()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + veiculosForm.getLeilao() + " na classe: " + Leilao.class.toString()));
		
		List<ClienteVeiculos> lances = clienteVeiculoRepository.findByveiculo(veiculos);
		
		
		TiposVeiculos tiposVeiculos = tiposVeiculosRepository.findById(veiculosForm.getTipoVeiculo()).orElseThrow(() -> new EntityNotFoundException("Não encontrado registro de id: " + veiculosForm.getTipoVeiculo() + " na classe: " + TiposVeiculos.class.toString()));
		
		if(!lances.isEmpty() && veiculos.getLeilao().getLeiId() != veiculosForm.getLeilao()) {
			throw new DispositivosInformaticaTemLancesException("O veiculo que está tentando alterar o leilão já possui lances registrados!!!");
		}
		
		
		LocalDateTime dataAtual = LocalDateTime.now();
		
		if(veiculos.getLeilao().getLeiDataOcorrencia() != leilao.getLeiDataOcorrencia() && !dataAtual.isBefore(leilao.getLeiDataOcorrencia()))  {
			throw new DispositivosInformaticaTemLancesException("O leilão que está cadastrando no veiculo já encerrou !!!");
		}
		
		veiculos.setLeilao(leilao);
		veiculos.setTipoVeiculo(tiposVeiculos);
		veiculos.setVeiAnoFabricacao(veiculosForm.getVeiAnoFabricacao());
		veiculos.setVeiCambio(veiculosForm.getVeiCambio());
		veiculos.setVeiCombustivel(veiculosForm.getVeiCombustivel());
		veiculos.setVeiCor(veiculosForm.getVeiCor());
		veiculos.setVeiDistanciaRodada(veiculosForm.getVeiDistanciaRodada());
		veiculos.setVeiMarca(veiculosForm.getVeiMarca());
		veiculos.setVeiPeso(veiculosForm.getVeiPeso());
		veiculos.setVeiPlaca(veiculosForm.getVeiPlaca());
		
        return ResponseEntity.ok().body(converteParaDto(veiculosRepository.save(veiculos)));
    }


    public void delete(Integer id) {

        veiculosRepository.deleteById(id);
    }

    public VeiculosDto converteParaDto(Veiculos veiculos) {
        return new VeiculosDto(
        		veiculos.getVeiId(),
        		veiculos.getVeiPlaca(),
        		veiculos.getVeiMarca(),
        		veiculos.getVeiAnoFabricacao(),
        		veiculos.getVeiDistanciaRodada(),
        		veiculos.getVeiCambio(),
        		veiculos.getVeiCombustivel(),
        		veiculos.getVeiCor(),
        		veiculos.getVeiPeso(),
        		veiculos.getTipoVeiculo().getTveiNome(),
        		veiculos.getLeilao().getLeiDataOcorrencia()
        );
        
    }
}