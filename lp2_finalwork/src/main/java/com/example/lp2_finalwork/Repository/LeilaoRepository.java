package com.example.lp2_finalwork.Repository;



import com.example.lp2_finalwork.Models.Leilao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Integer> {
    
}
