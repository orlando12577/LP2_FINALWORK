package com.example.lp2_finalwork.Controller;



import com.example.lp2_finalwork.Models.ClienteVeiculos;
import com.example.lp2_finalwork.Services.ClienteVeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente-veiculos")
public class ClienteVeiculoController {
    @Autowired
    private ClienteVeiculoService clienteVeiculosService;

    @PostMapping("/save")
    public ResponseEntity<ClienteVeiculos> save(@RequestBody ClienteVeiculos clienteVeiculos) {
        ClienteVeiculos savedClienteVeiculos = clienteVeiculosService.save(clienteVeiculos);
        return ResponseEntity.ok(savedClienteVeiculos);
    }

    @PutMapping("/update")
    public ResponseEntity<ClienteVeiculos> update(@RequestBody ClienteVeiculos clienteVeiculos) {
        try {
            ClienteVeiculos updatedClienteVeiculos = clienteVeiculosService.update(clienteVeiculos);
            return ResponseEntity.ok(updatedClienteVeiculos);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        clienteVeiculosService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<ClienteVeiculos>> findById(@PathVariable int id) {
        Optional<ClienteVeiculos> clienteVeiculos = clienteVeiculosService.findById(id);
        if (clienteVeiculos.isPresent()) {
            return ResponseEntity.ok(clienteVeiculos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ClienteVeiculos>> findAll() {
        List<ClienteVeiculos> clienteVeiculosList = clienteVeiculosService.findAll();
        return ResponseEntity.ok(clienteVeiculosList);
    }

}
