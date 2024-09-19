package com.example.lp2_finalwork.Controller;



import com.example.lp2_finalwork.Models.ClienteDispositivoInformatica;
import com.example.lp2_finalwork.Services.ClienteDIspositivoInformativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente-dispositivos-informatica")
public class ClienteDispositivoInformaticaController {

    @Autowired
    private ClienteDIspositivoInformativaService clienteDispositivoInformaticaService;

    // Endpoint para criar um novo ClienteDispositivoInformatica
    @PostMapping("/create")
    public ResponseEntity<ClienteDispositivoInformatica> createClienteDispositivoInformatica(@RequestBody ClienteDispositivoInformatica clienteDispositivoInformatica) {
        ClienteDispositivoInformatica savedClienteDispositivoInformatica = clienteDispositivoInformaticaService.save(clienteDispositivoInformatica);
        return ResponseEntity.ok(savedClienteDispositivoInformatica);
    }

    // Endpoint para atualizar um ClienteDispositivoInformatica existente
    @PutMapping("/update/{id}")
    public ResponseEntity<ClienteDispositivoInformatica> updateClienteDispositivoInformatica(@PathVariable("id") int id, @RequestBody ClienteDispositivoInformatica clienteDispositivoInformatica) {
        Optional<ClienteDispositivoInformatica> optionalClienteDispositivoInformatica = clienteDispositivoInformaticaService.findById(id);
        if (optionalClienteDispositivoInformatica.isPresent()) {
            ClienteDispositivoInformatica updatedClienteDispositivoInformatica = clienteDispositivoInformaticaService.update(clienteDispositivoInformatica);
            return ResponseEntity.ok(updatedClienteDispositivoInformatica);
        }
        return ResponseEntity.notFound().build();
    }

    // Endpoint para deletar um ClienteDispositivoInformatica por ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteClienteDispositivoInformatica(@PathVariable("id") int id) {
        clienteDispositivoInformaticaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Endpoint para buscar um ClienteDispositivoInformatica por ID
    @GetMapping("/find/{id}")
    public ResponseEntity<ClienteDispositivoInformatica> findClienteDispositivoInformaticaById(@PathVariable("id") int id) {
        Optional<ClienteDispositivoInformatica> optionalClienteDispositivoInformatica = clienteDispositivoInformaticaService.findById(id);
        return optionalClienteDispositivoInformatica.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint para listar todos os ClienteDispositivoInformatica
    @GetMapping("/findAll")
    public ResponseEntity<List<ClienteDispositivoInformatica>> findAllClienteDispositivoInformatica() {
        List<ClienteDispositivoInformatica> clienteDispositivoInformaticaList = clienteDispositivoInformaticaService.findAll();
        return ResponseEntity.ok(clienteDispositivoInformaticaList);
    }
   
}

