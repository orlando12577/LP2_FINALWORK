package br.gov.fazenda.receita.leilao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fazenda.receita.leilao.entity.Financeira;
import br.gov.fazenda.receita.leilao.service.FinanceiraService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/financeira")
@CrossOrigin
public class FinanceiraController {

    @Autowired
    private FinanceiraService service;

    @GetMapping(value = "/{id}")
    @Operation(summary = "BUSCA FINANCEIRA", description = "BUSCA UMA NOVA FINANCEIRA PELO CNPJ", tags = {"/financeira" })
    public Financeira buscarFinanceiraPorCnpj(@PathVariable("id") Long id){
        return service.buscarFinanceiraPorId(id);
    }

    @PostMapping
    @Operation(summary = "CRIA FINANCEIRA", description = "CRIA UMA NOVA FINANCEIRA COM AS CARACTERISTICAS INFORMADAS", tags = {"/financeira" })
    public Financeira novaFinanceira(@RequestBody Financeira financeira) {
        return service.novaFinanceira(financeira);
    }

    @DeleteMapping(value = "/{id}")
    @Operation(summary = "EXCLUI FINANCEIRA", description = "EXCLUI FINANCEIRA PELO CNPJ INFORMADA", tags = {"/financeira" })
    public void excluirFinanceiraPorCnpj(@PathVariable("id") Long id){
        service.excluirFinanceiraPorId(id);
    }

    @PutMapping
    @Operation(summary = "ATUALIZA FINANCEIRA", description = "ATUALIZA INFORMAÇÕES DA FINANCEIRA", tags = {"/financeira" })
    public Financeira atualizaFinanceira(@RequestBody Financeira financeira) {
        return service.novaFinanceira(financeira);
    }

    @GetMapping
    @Operation(summary = "BUSCA TODAS FINANCEIRAS", description = "BUSCA TODAS AS FINACEIRAS CADASTRADAS", tags = {"/financeira" })
    public List<Financeira> buscarTodasFinanceiras() {
        return service.buscarTodasFinanceiras();
    }
    
}
