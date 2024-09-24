package com.example.lp2_finalwork.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "TIPOS_VEICULOS")
public class TiposVeiculos {
    	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tveiId;
	
	private String tveiNome;

	public Integer getTveiId() {
		return tveiId;
	}

	public void setTveiId(Integer tveiId) {
		this.tveiId = tveiId;
	}

	public String getTveiNome() {
		return tveiNome;
	}

	public void setTveiNome(String tveiNome) {
		this.tveiNome = tveiNome;
	}
	
	

}