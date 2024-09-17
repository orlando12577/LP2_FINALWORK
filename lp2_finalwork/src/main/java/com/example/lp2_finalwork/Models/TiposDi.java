package com.example.lp2_finalwork.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TIPOS_DIS")
public class TiposDi {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tipodiId;
	
	private String tipodiNome;

	public Integer getTipodiId() {
		return tipodiId;
	}
    public void setTdiId(Integer tdiId) {
		this.tipodiId = tdiId;
	}

	public String getTipodiNome() {
		return tipodiNome;
	}

	public void setTdiNome(String tdiNome) {
		this.tipodiNome = tipodiNome;
	}
	
}
