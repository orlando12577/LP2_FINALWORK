package com.example.lp2_finalwork.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.lp2_finalwork.Models.ClienteDispositivoInformatica;
import com.example.lp2_finalwork.Models.DispositivoInformatica;

@Repository
public interface ClienteDispositivoInformaticaRepository extends JpaRepository<ClienteDispositivoInformatica, Integer> {
    List<ClienteDispositivoInformatica> findBydispositivoInformatica(DispositivoInformatica dispositivoInformatica);
}
