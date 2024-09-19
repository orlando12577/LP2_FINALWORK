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

import com.example.lp2_finalwork.Models.Veiculo;
import com.example.lp2_finalwork.Services.VeiculoService;
import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping("/create")
    public ResponseEntity<Veiculo> createVeiculo(@RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(veiculoService.save(veiculo));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Veiculo> updateVeiculo(@PathVariable("id") int id, @RequestBody Veiculo veiculo) {
        return veiculoService.findById(id)
                .map(v -> ResponseEntity.ok(veiculoService.update(veiculo)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable("id") int id) {
        veiculoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Veiculo> findVeiculoById(@PathVariable("id") int id) {
        return veiculoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Veiculo>> findAllVeiculos() {
        return ResponseEntity.ok(veiculoService.findAll());
    }
}
