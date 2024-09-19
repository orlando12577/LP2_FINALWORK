package com.example.lp2_finalwork.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.lp2_finalwork.Models.ClienteDispositivoInformatica;

@Repository
public interface ClienteDispositivoInformaticaRepository extends JpaRepository<ClienteDispositivoInformatica, Integer> {
    
}
