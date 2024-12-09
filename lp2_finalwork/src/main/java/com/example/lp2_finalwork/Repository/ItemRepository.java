package com.example.lp2_finalwork.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.entity.Item;



@Repository 
public interface ItemRepository extends JpaRepository<Item, Long>{

    @Query("SELECT i FROM Item i WHERE i.leilao.id = :idLeilao ORDER BY i.nome")
    List<Item> findAllByLeilaoIdOrderByNome(@Param("idLeilao") Long idLeilao);
    
}

