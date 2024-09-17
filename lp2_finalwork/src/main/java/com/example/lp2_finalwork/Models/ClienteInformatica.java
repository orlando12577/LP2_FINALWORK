package com.example.lp2_finalwork.Models;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE_DISPOSITIVO_INFORMATICA")
public class ClienteInformatica {
    
	
	public ClienteInformatica(Double clidiValorLance, Cliente cliente,
			DispositivoInformatica dispositivoInformatica, LocalDateTime clidiDataHoraLance) {
		super();
		this.clidisValorLance = clidiValorLance;
		this.cliente = cliente;
		this.dispositivoInformatica = dispositivoInformatica;
		this.clidisDataHoraLance = clidiDataHoraLance;
	}

	public ClienteInformatica() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clidisId;
	
	private Double clidisValorLance;
	
	private LocalDateTime clidisDataHoraLance;
	
	@ManyToOne
	@JoinColumn(name = "cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "dispositivo_informatica")
	private DispositivoInformatica dispositivoInformatica;

    public int getClidisId() {
        return clidisId;
    }

    public void setClidisId(int clidisId) {
        this.clidisId = clidisId;
    }

    public Double getClidisValorLance() {
        return clidisValorLance;
    }

    public void setClidisValorLance(Double clidisValorLance) {
        this.clidisValorLance = clidisValorLance;
    }

    public LocalDateTime getClidisDataHoraLance() {
        return clidisDataHoraLance;
    }

    public void setClidisDataHoraLance(LocalDateTime clidisDataHoraLance) {
        this.clidisDataHoraLance = clidisDataHoraLance;
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
