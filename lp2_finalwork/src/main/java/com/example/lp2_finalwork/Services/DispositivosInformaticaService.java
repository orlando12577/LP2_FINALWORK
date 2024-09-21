package com.example.lp2_finalwork.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Models.DispositivoInformatica;
import com.example.lp2_finalwork.Models.TiposDi;
import com.example.lp2_finalwork.Repository.DispositivosInformaticaRepository;
import com.example.lp2_finalwork.Repository.TiposDiRepository;
import com.example.lp2_finalwork.dtos.DispositivoInformaticaDto;
import com.example.lp2_finalwork.dtos.DispositivoInformaticaForm;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DispositivosInformaticaService {

    @Autowired
    private DispositivosInformaticaRepository dispositivosInformaticaRepository;

    @Autowired
    private TiposDiRepository tipoDiRepository;

    // Método para obter todos os dispositivos e convertê-los em DTOs
    public ResponseEntity<List<DispositivoInformaticaDto>> getAll() {
        List<DispositivoInformatica> dispositivoInformaticas = dispositivosInformaticaRepository.findAll();
        List<DispositivoInformaticaDto> dispositivoInformaticaDtos = new ArrayList<>();

        for (DispositivoInformatica dispositivoInformatica : dispositivoInformaticas) {
            dispositivoInformaticaDtos.add(converteParaDto(dispositivoInformatica));
        }
        return ResponseEntity.ok().body(dispositivoInformaticaDtos);
    }

    // Método para salvar um novo dispositivo
    public ResponseEntity<DispositivoInformaticaDto> save(DispositivoInformaticaForm dispositivoInformaticaForm) {
        TiposDi tipoDi = tipoDiRepository.findById(dispositivoInformaticaForm.getTipoDi())
                .orElseThrow(() -> new EntityNotFoundException(
                        "Não encontrado registro de id: " + dispositivoInformaticaForm.getTipoDi() + " na classe: " + TiposDi.class.toString()));

        DispositivoInformatica dispositivoInformatica = new DispositivoInformatica(
                dispositivoInformaticaForm.getDiEnderecoFisico(),
                dispositivoInformaticaForm.getDiMarca(),
                dispositivoInformaticaForm.getDiProcessador(),
                dispositivoInformaticaForm.getDiTela(),
                dispositivoInformaticaForm.getDiArmazenamento(),
                dispositivoInformaticaForm.getDiMemoria(),
                dispositivoInformaticaForm.getDiTensao(),
                dispositivoInformaticaForm.getDiNumeroPortas(),
                tipoDi
        );

        return ResponseEntity.ok().body(converteParaDto(dispositivosInformaticaRepository.save(dispositivoInformatica)));
    }

    // Método para atualizar um dispositivo existente
    public ResponseEntity<DispositivoInformaticaDto> update(DispositivoInformaticaForm dispositivoInformaticaForm, Integer id) {
        DispositivoInformatica dispositivoInformatica = dispositivosInformaticaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Não encontrado registro de id: " + id + " na classe: " + DispositivoInformatica.class.toString()));

        TiposDi tipoDi = tipoDiRepository.findById(dispositivoInformaticaForm.getTipoDi())
                .orElseThrow(() -> new EntityNotFoundException(
                        "Não encontrado registro de id: " + dispositivoInformaticaForm.getTipoDi() + " na classe: " + TiposDi.class.toString()));

        dispositivoInformatica.setDiArmazenamento(dispositivoInformaticaForm.getDiArmazenamento());
        dispositivoInformatica.setDiEnderecoFisico(dispositivoInformaticaForm.getDiEnderecoFisico());
        dispositivoInformatica.setDiMarca(dispositivoInformaticaForm.getDiMarca());
        dispositivoInformatica.setDiMemoria(dispositivoInformaticaForm.getDiMemoria());
        dispositivoInformatica.setDiNumeroPortas(dispositivoInformaticaForm.getDiNumeroPortas());
        dispositivoInformatica.setDiProcessador(dispositivoInformaticaForm.getDiProcessador());
        dispositivoInformatica.setDiTela(dispositivoInformaticaForm.getDiTela());
        dispositivoInformatica.setDiTensao(dispositivoInformaticaForm.getDiTensao());
        dispositivoInformatica.setTipoDi(tipoDi);

        return ResponseEntity.ok().body(converteParaDto(dispositivosInformaticaRepository.save(dispositivoInformatica)));
    }

    // Método para deletar um dispositivo por ID
    public void delete(Integer id) {
        DispositivoInformatica dispositivoInformatica = dispositivosInformaticaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Não encontrado registro de id: " + id + " na classe: " + DispositivoInformatica.class.toString()));

        dispositivosInformaticaRepository.delete(dispositivoInformatica);
    }

    // Método para obter um dispositivo por ID
    public ResponseEntity<DispositivoInformaticaDto> getById(Integer id) {
        DispositivoInformatica dispositivoInformatica = dispositivosInformaticaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Não encontrado registro de id: " + id + " na classe: " + DispositivoInformatica.class.toString()));

        return ResponseEntity.ok().body(converteParaDto(dispositivoInformatica));
    }

    // Converte um DispositivoInformatica para DTO
    public DispositivoInformaticaDto converteParaDto(DispositivoInformatica dispositivoInformatica) {
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
                dispositivoInformatica.getTipoDi().getTdiNome()
        );
    }
}
