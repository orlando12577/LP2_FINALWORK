package br.gov.fazenda.receita.leilao.service;

import java.util.List;

import br.gov.fazenda.receita.leilao.entity.Usuario;

public interface UsuarioService {

    public Usuario buscarUsuarioPorCpf(String cpf);

    public Usuario novoUsuario(Usuario usuario);

    public String excluirUsuarioPorCpf(String cpf);

    public List<Usuario> buscarTodosUsuarios();
        
}
