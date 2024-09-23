package com.example.lp2_finalwork.Repository;


import com.example.lp2_finalwork.Controller.EntidadesFinanceirasController;
import com.example.lp2_finalwork.Models.EntidadeFinanceira;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EntidadesFinanceirasRepository extends JpaRepository<EntidadeFinanceira, Integer> {
}


