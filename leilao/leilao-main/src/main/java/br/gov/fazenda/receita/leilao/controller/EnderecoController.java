package br.gov.fazenda.receita.leilao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fazenda.receita.leilao.entity.Endereco;
import br.gov.fazenda.receita.leilao.service.EnderecoService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/endereco")
@CrossOrigin
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @GetMapping(value = "/{id}")
    @Operation(summary = "BUSCAR ENDEREÇO", description = "BUSCAR ENDEREÇO POR ID", tags = {"/endereço" })
    public Endereco buscarEnderecoPorId (@PathVariable("id") Long id){
        return service.buscarEnderecoPorId(id);
    }
    
}
