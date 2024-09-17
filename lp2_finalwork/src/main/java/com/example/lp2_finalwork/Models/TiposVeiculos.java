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
	private Integer tipoveiId;
	
	private String tipoveiNome;

	public Integer getTipoveiId() {
		return tipoveiId;
	}

	public void setTipoveiId(Integer tveiId) {
		this.tipoveiId = tveiId;
	}

	public String getTveiNome() {
		return tipoveiNome;
	}

	public void setTveiNome(String tveiNome) {
		this.tipoveiNome = tipoveiNome;
	}
	
	
    
}
