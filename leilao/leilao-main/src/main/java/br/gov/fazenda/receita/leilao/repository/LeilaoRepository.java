package br.gov.fazenda.receita.leilao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.fazenda.receita.leilao.entity.Leilao;

@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Long>{
    
    List<Leilao> findAllByOrderByDataInicial();

    
}
