package br.gov.fazenda.receita.leilao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.gov.fazenda.receita.leilao.entity.Item;

@Repository 
public interface ItemRepository extends JpaRepository<Item, Long>{

    @Query("SELECT i FROM Item i WHERE i.leilao.id = :idLeilao ORDER BY i.nome")
    List<Item> findAllByLeilaoIdOrderByNome(@Param("idLeilao") Long idLeilao);
    
}

