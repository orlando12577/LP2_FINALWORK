package com.example.lp2_finalwork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lp2_finalwork.Models.Leilao;
import com.example.lp2_finalwork.Services.LeilaoService;

import java.util.List;

@RestController
@RequestMapping("/api/leiloes")
public class LeilaoController {

    @Autowired
    private LeilaoService leilaoService;

    @PostMapping("/create")
    public ResponseEntity<Leilao> createLeilao(@RequestBody Leilao leilao) {
        return ResponseEntity.ok(leilaoService.save(leilao));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Leilao> updateLeilao(@PathVariable("id") int id, @RequestBody Leilao leilao) {
        return leilaoService.findById(id)
                .map(l -> ResponseEntity.ok(leilaoService.update(leilao)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteLeilao(@PathVariable("id") int id) {
        leilaoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Leilao> findLeilaoById(@PathVariable("id") int id) {
        return leilaoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Leilao>> findAllLeiloes() {
        return ResponseEntity.ok(leilaoService.findAll());
    }
}

