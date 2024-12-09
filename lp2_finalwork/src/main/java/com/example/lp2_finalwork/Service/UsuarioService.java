package com.example.lp2_finalwork.Service;

import java.util.List;

import com.example.lp2_finalwork.entity.Usuario;

public interface UsuarioService {

    public Usuario buscarUsuarioPorCpf(String cpf);

    public Usuario novoUsuario(Usuario usuario);

    public String excluirUsuarioPorCpf(String cpf);

    public List<Usuario> buscarTodosUsuarios();
        
}