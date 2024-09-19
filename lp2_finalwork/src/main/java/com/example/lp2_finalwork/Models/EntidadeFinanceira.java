package com.example.lp2_finalwork.Models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "ENTIDADE_FINANCEIRA")
public class EntidadeFinanceira {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer entidadefinId;
	
	private String entidadefinNome;
	
	@ManyToMany(mappedBy = "entidadesFinanceiras")
	private List<Leilao> leiloes;
	
	public EntidadeFinanceira() {}



    public EntidadeFinanceira(String entidadefinNome) {
		super();
		this.entidadefinNome = entidadefinNome;
	}



	public Integer getEntidadefinId() {
		return entidadefinId;
	}

	public void setEntidadefinId(Integer entfinId) {
		this.entidadefinId = entidadefinId;
	}

	public String getEntidadefinNome() {
		return entidadefinNome;
	}

	public void setEntidadefinNome(String entidadefinNome) {
		this.entidadefinNome = entidadefinNome;
	}



	public List<Leilao> getLeiloes() {
		return leiloes;
	}



	public void setLeiloes(List<Leilao> leiloes) {
		this.leiloes = leiloes;
	}
	
	
	
	
}
