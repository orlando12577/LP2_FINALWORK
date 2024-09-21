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

    @PostMapping
    public EntidadeFinanceira create(@RequestBody EntidadeFinanceira entidadeFinanceira) {
        return entidadeFinanceiraService.save(entidadeFinanceira);
    }

    @PutMapping
    public EntidadeFinanceira update(@RequestBody EntidadeFinanceira entidadeFinanceira) {
        return entidadeFinanceiraService.update(entidadeFinanceira);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        entidadeFinanceiraService.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<EntidadeFinanceira> findById(@PathVariable int id) {
        return entidadeFinanceiraService.findById(id);
    }

    @GetMapping
    public List<EntidadeFinanceira> findAll() {
        return entidadeFinanceiraService.findAll();
    }
}
