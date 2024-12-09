package com.example.lp2_finalwork.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Repository.UsuarioRepository;
import com.example.lp2_finalwork.entity.Usuario;

import jakarta.transaction.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Override
    public Usuario buscarUsuarioPorCpf(String cpf) {
        Optional<Usuario> usuarioOp = usuarioRepo.findByCpf(cpf);
        if(usuarioOp.isEmpty()){
            throw new IllegalArgumentException("Usuario não encontrado!");
        }
        return usuarioOp.get();
    }

    @Transactional
    @Override
    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null ||
                usuario.getCpf() == null ||
                usuario.getCpf().isBlank() ||        
                usuario.getNome() == null ||
                usuario.getNome().isBlank() || 
                usuario.getEmail() == null ||
                usuario.getEmail().isBlank() ||
                usuario.getTelefone() == null ||
                usuario.getTelefone().isBlank()) {
            throw new IllegalArgumentException("Usuário com atributos inválidos!");
        }

        usuario = usuarioRepo.save(usuario);

        return usuario;
    }

    @Transactional
    @Override
    public String excluirUsuarioPorCpf(String cpf) {
        Optional<Usuario> usuarioOp = usuarioRepo.findByCpf(cpf);
        if(usuarioOp.isEmpty()){
            throw new IllegalArgumentException("Usuario não encontrado!");
        }
        usuarioRepo.deleteByCpf(cpf);
        return "Usuário com CPF " + cpf + " foi deletado com sucesso.";
    }

    @Override
    public List<Usuario> buscarTodosUsuarios() {
        return usuarioRepo.findAll();
    }

}