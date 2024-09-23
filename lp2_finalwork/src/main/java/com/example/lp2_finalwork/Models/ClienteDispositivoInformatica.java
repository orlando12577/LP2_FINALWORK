package com.example.lp2_finalwork.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE_DISPOSITVO_INFORMATICA")
public class ClienteDispositivoInformatica{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clidiId;
	
	private Double clidiValorLance;
	
	@ManyToOne
	@JoinColumn(name = "cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "dispositivo_informatica")
	private DispositivoInformatica dispositivoInformatica;

	public ClienteDispositivoInformatica(Double clidiValorLance, Cliente cliente,
			DispositivoInformatica dispositivoInformatica) {
		super();
		this.clidiValorLance = clidiValorLance;
		this.cliente = cliente;
		this.dispositivoInformatica = dispositivoInformatica;
	}

	public ClienteDispositivoInformatica() {}
	


	

	public int getClidiId() {
		return clidiId;
	}

	public void setClidiId(int clidiId) {
		this.clidiId = clidiId;
	}

	public Double getClidiValorLance() {
		return clidiValorLance;
	}

	public void setClidiValorLance(Double clidiValorLance) {
		this.clidiValorLance = clidiValorLance;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public DispositivoInformatica getDispositivoInformatica() {
		return dispositivoInformatica;
	}

	public void setDispositivoInformatica(DispositivoInformatica dispositivoInformatica) {
		this.dispositivoInformatica = dispositivoInformatica;
	}
	
	
	
}