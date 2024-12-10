package br.gov.fazenda.receita.leilao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.fazenda.receita.leilao.entity.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    public Optional<Usuario> findByCpf(String cpf);

    public String deleteByCpf(String cpf);
    
}
