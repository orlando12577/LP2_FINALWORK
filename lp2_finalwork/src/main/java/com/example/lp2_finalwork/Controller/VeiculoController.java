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


import com.example.lp2_finalwork.Services.VeiculosService;
import com.example.lp2_finalwork.dtos.VeiculosDto;
import com.example.lp2_finalwork.dtos.VeiculosForm;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculosService veiculosService;

    @GetMapping
    //Todos as Informaçãoes do Veiculos
    public ResponseEntity<List<VeiculosDto>> getAll() {

        return veiculosService.getAll();

    }

    @PostMapping
    public ResponseEntity<VeiculosDto> save(@RequestBody VeiculosForm veiculosForm) {
        return veiculosService.save(veiculosForm);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VeiculosDto> update(@RequestBody VeiculosForm veiculosForm, @PathVariable Integer id) {
        return veiculosService.update(veiculosForm,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        veiculosService.delete(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculosDto> getById(@PathVariable Integer id) {
        return veiculosService.getById(id);
    }
}
