package com.example.lp2_finalwork.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.Models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
    
    Cliente findBycliCpf(String cpf);
	
	Long deleteBycliCpf(String cpf);

}

