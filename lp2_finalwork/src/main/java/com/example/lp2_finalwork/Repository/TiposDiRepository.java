package com.example.lp2_finalwork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.Models.TiposDi;

@Repository
public interface TiposDiRepository extends JpaRepository<TiposDi, Integer>{

}
    

