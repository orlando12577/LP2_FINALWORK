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

import br.gov.fazenda.receita.leilao.entity.Usuario;
import br.gov.fazenda.receita.leilao.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService service;
    
    @GetMapping(value = "/{cpf}")
    @Operation(summary = "BUSCA USUARIO", description = "BUSCA USUARIO PELO CPF INFORMADO", tags = {"/usuario" })
    public Usuario buscarUsuarioPorCpf(@PathVariable("cpf") String cpf) {
        return service.buscarUsuarioPorCpf(cpf);
    }

    @PostMapping
    @Operation(summary = "CRIA USUARIO", description = "CRIA UM NOVO USUARIO COM AS CARACTERISTICAS INFORMADAS", tags = {"/usuario" })
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return service.novoUsuario(usuario);
    }

    @DeleteMapping(value = "/{cpf}")
    @Operation(summary = "EXCLUI USUARIO", description = "EXCLUI USUARIO PELO CPF INFORMADO", tags = {"/usuario" })
    public String excluirUsuarioPorCpf(@PathVariable("cpf") String cpf){
        return service.excluirUsuarioPorCpf(cpf);
    }

    @PutMapping
    @Operation(summary = "ATUALIZA USUARIO", description = "ATUALIZA INFORMAÇÕES USUARIO", tags = {"/usuario" })
    public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
        return service.novoUsuario(usuario);
    }

    @GetMapping
    @Operation(summary = "BUSCA TODOS USUARIOS", description = "BUSCA TODOS OS USUARIOS CADASTRADOS", tags = {"/usuario" })
    public List<Usuario> buscarTodosUsuarios() {
        return service.buscarTodosUsuarios();
    }
    
}
