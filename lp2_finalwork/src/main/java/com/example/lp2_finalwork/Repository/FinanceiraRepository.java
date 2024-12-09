package com.example.lp2_finalwork.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.entity.Financeira;




@Repository
public interface FinanceiraRepository extends JpaRepository<Financeira, Long>{

    public Optional<Financeira> findById(Long id);
    public void deleteById(Long id);
    
}