package com.example.lp2_finalwork.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.entity.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    public Optional<Usuario> findByCpf(String cpf);

    public String deleteByCpf(String cpf);
    
}
