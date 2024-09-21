package com.example.lp2_finalwork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.Models.DispositivoInformatica;


@Repository
public interface DispositivosInformaticaRepository extends JpaRepository<DispositivoInformatica, Integer>{
    
}