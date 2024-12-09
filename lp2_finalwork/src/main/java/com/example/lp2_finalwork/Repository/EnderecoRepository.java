package com.example.lp2_finalwork.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.entity.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}

