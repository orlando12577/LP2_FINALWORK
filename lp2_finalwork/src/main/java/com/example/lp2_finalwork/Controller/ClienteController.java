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

import com.example.lp2_finalwork.Models.Cliente;
import com.example.lp2_finalwork.Services.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/create")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.save(cliente));
    }

    @PutMapping("/update/{cpf}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable("cpf") String cpf, @RequestBody Cliente cliente) {
        return clienteService.findById(cpf)
                .map(c -> ResponseEntity.ok(clienteService.update(cliente)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{cpf}")
    public ResponseEntity<Void> deleteCliente(@PathVariable("cpf") String cpf) {
        clienteService.delete(cpf);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/find/{cpf}")
    public ResponseEntity<Cliente> findClienteById(@PathVariable("cpf") String cpf) {
        return clienteService.findById(cpf)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Cliente>> findAllClientes() {
        return ResponseEntity.ok(clienteService.findAll());
    }
}
