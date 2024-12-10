package br.gov.fazenda.receita.leilao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.fazenda.receita.leilao.entity.Lance;

@Repository
public interface LanceRepository extends JpaRepository<Lance, Long> {
    
    List<Lance> findAllByOrderByDatahoraAsc();
    
    List<Lance> findByItemId(Long itemId);
    
    List<Lance> findByUsuarioId(Long usuarioId);
}
