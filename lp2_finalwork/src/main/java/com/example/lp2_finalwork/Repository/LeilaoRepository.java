package com.example.lp2_finalwork.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.entity.Leilao;



@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Long>{
    
    List<Leilao> findAllByOrderByDataInicial();

    
}