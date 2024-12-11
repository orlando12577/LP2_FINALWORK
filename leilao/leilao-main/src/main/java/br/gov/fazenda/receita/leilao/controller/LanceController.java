package br.gov.fazenda.receita.leilao.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.gov.fazenda.receita.leilao.entity.Lance;
import br.gov.fazenda.receita.leilao.service.LanceService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/lance")
@CrossOrigin
public class LanceController {

    @Autowired
    private LanceService service;

    @GetMapping(value = "/{id}")
    @Operation(summary = "BUSCAR LANCE", description = "BUSCAR LANCE POR ID", tags = { "/lance" })
    public Lance buscarLancePorId(@PathVariable("id") Long id) {
        return service.buscarLancePorId(id);
    }

    @PostMapping
    @Operation(summary = "INSERIR LANCE", description = "INSERIR NOVO LANCE", tags = { "/lance" })
    public Lance novoLance(@RequestBody Lance lance) {
        return service.novoLance(lance);
    }

    @PutMapping(value = "/{id}")
    @Operation(summary = "ATUALIZAR LANCE", description = "ATUALIZAR LANCE PELO ID", tags = { "/lance" })
    public ResponseEntity<Lance> atualizarLance(@RequestBody Lance lance, @PathVariable Long id) {
        Lance atualizado = service.atualizarLance(id, lance);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping(value = "/{id}")
    @Operation(summary = "EXCLUIR LANCE", description = "EXCLUIR LANCE PELO ID", tags = { "/lance" })
    public ResponseEntity<Void> excluirLance(@PathVariable Long id) {
        service.excluirLance(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/todos")
    @Operation(summary = "BUSCAR TODOS LANCES", description = "BUSCAR TODOS LANCES ORDENADOS POR DATA", tags = { "/lance" })
    public List<Lance> buscarTodosLancesOrdenadosPorDataHora() {
        return service.buscarTodosLancesOrdenadosPorDataHora();
    }
}
