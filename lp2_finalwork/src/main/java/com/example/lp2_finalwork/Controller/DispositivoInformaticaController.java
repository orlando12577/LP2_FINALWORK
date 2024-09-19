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

import com.example.lp2_finalwork.Models.DispositivoInformatica;
import com.example.lp2_finalwork.Services.DispositivoInformaticaService;

import java.util.List;


@RestController
@RequestMapping("/api/dispositivos")
public class DispositivoInformaticaController {

    @Autowired
    private DispositivoInformaticaService dispositivoInformaticaService;

    @PostMapping("/create")
    public ResponseEntity<DispositivoInformatica> createDispositivo(@RequestBody DispositivoInformatica dispositivo) {
        return ResponseEntity.ok(dispositivoInformaticaService.save(dispositivo));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<DispositivoInformatica> updateDispositivo(@PathVariable("id") int id, @RequestBody DispositivoInformatica dispositivo) {
        return dispositivoInformaticaService.findById(id)
                .map(d -> ResponseEntity.ok(dispositivoInformaticaService.update(dispositivo)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDispositivo(@PathVariable("id") int id) {
        dispositivoInformaticaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<DispositivoInformatica> findDispositivoById(@PathVariable("id") int id) {
        return dispositivoInformaticaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<DispositivoInformatica>> findAllDispositivos() {
        return ResponseEntity.ok(dispositivoInformaticaService.findAll());
    }
}
