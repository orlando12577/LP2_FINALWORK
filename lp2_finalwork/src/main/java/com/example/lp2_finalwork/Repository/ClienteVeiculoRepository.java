package com.example.lp2_finalwork.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lp2_finalwork.Models.ClienteVeiculos;
import com.example.lp2_finalwork.Models.Veiculos;


@Repository
public interface ClienteVeiculoRepository extends JpaRepository<ClienteVeiculos, Integer> {
	
	List<ClienteVeiculos> findByveiculo(Veiculos veiculos);

}

