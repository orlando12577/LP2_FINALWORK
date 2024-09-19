package com.example.lp2_finalwork.Controller;

import com.example.lp2_finalwork.Models.EntidadeFinanceira;
import com.example.lp2_finalwork.Services.EntidadeFinanceiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/entidades-financeiras")
public class EntidadeFinanceiraController {

    @Autowired
    private EntidadeFinanceiraService entidadeFinanceiraService;

    // Endpoint para criar uma nova entidade financeira
    @PostMapping("/create")
    public ResponseEntity<EntidadeFinanceira> createEntidadeFinanceira(@RequestBody EntidadeFinanceira entidadeFinanceira) {
        EntidadeFinanceira savedEntidadeFinanceira = entidadeFinanceiraService.save(entidadeFinanceira);
        return ResponseEntity.ok(savedEntidadeFinanceira);
    }

    // Endpoint para atualizar uma entidade financeira existente
    @PutMapping("/update/{entidadefinId}")
    public ResponseEntity<EntidadeFinanceira> updateEntidadeFinanceira(@PathVariable("entidadefinId") int entidadefinId, @RequestBody EntidadeFinanceira entidadeFinanceira) {
        Optional<EntidadeFinanceira> optionalEntidadeFinanceira = entidadeFinanceiraService.findById(entidadefinId);
        if (optionalEntidadeFinanceira.isPresent()) {
            EntidadeFinanceira updatedEntidadeFinanceira = entidadeFinanceiraService.update(entidadeFinanceira);
            return ResponseEntity.ok(updatedEntidadeFinanceira);
        }
        return ResponseEntity.notFound().build();
    }

    // Endpoint para deletar uma entidade financeira por ID
    @DeleteMapping("/delete/{entidadefinId}")
    public ResponseEntity<Void> deleteEntidadeFinanceira(@PathVariable("entidadefinId") int entidadefinId) {
        entidadeFinanceiraService.delete(entidadefinId);
        return ResponseEntity.noContent().build();
    }

    // Endpoint para buscar uma entidade financeira por ID
    @GetMapping("/find/{entidadefinId}")
    public ResponseEntity<EntidadeFinanceira> findEntidadeFinanceiraById(@PathVariable("entidadefinId") int entidadefinId) {
        Optional<EntidadeFinanceira> optionalEntidadeFinanceira = entidadeFinanceiraService.findById(entidadefinId);
        return optionalEntidadeFinanceira.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint para listar todas as entidades financeiras
    @GetMapping("/findAll")
    public ResponseEntity<List<EntidadeFinanceira>> findAllEntidadesFinanceiras() {
        List<EntidadeFinanceira> entidadesFinanceiras = entidadeFinanceiraService.findAll();
        return ResponseEntity.ok(entidadesFinanceiras);
    }
}
