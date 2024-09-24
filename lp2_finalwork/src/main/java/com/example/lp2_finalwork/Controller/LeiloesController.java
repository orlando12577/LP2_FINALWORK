package com.example.lp2_finalwork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.lp2_finalwork.Services.LeilaoService;
import com.example.lp2_finalwork.dtos.LeilaoDto;
import com.example.lp2_finalwork.dtos.LeilaoForm;


import java.util.List;

@RestController
@RequestMapping("/api/leilao")
@CrossOrigin(origins="*")
public class LeiloesController {
	@Autowired
    private LeilaoService leilaoService;

    @GetMapping
    public ResponseEntity<List<LeilaoDto>> getAll() {

        return leilaoService.getAll();
    }

    @PostMapping
    public ResponseEntity<LeilaoDto> save(@RequestBody LeilaoForm leilaoForm) {


        return leilaoService.save(leilaoForm);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LeilaoDto> update(@RequestBody LeilaoForm leilaoForm, @PathVariable Integer id) {
        return leilaoService.update(leilaoForm, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        leilaoService.delete(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LeilaoDto> getById(@PathVariable Integer id){
        return leilaoService.getById(id);
    }
}

