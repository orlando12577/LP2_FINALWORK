package com.example.lp2_finalwork.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DISPOSITIVOS_AUTOMATICO")
public class DispositivoInformatica {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int disId;
	private String disEnderecoFisico;
	private String disMarca;
	private String disProcessador; 
	private String disTela;
	private double disArmazenamento;
	private double disMemoria;
	private int disTensao;
	private int disNumeroPortas;


    public int getDisId() {
        return disId;
    }
    public void setDisId(int disId) {
        this.disId = disId;
    }
    public String getDisEnderecoFisico() {
        return disEnderecoFisico;
    }
    public void setDisEnderecoFisico(String disEnderecoFisico) {
        this.disEnderecoFisico = disEnderecoFisico;
    }
    public String getDisMarca() {
        return disMarca;
    }
    public void setDisMarca(String disMarca) {
        this.disMarca = disMarca;
    }
    public String getDisProcessador() {
        return disProcessador;
    }
    public void setDisProcessador(String disProcessador) {
        this.disProcessador = disProcessador;
    }
    public String getDisTela() {
        return disTela;
    }
    public void setDisTela(String disTela) {
        this.disTela = disTela;
    }
    public double getDisArmazenamento() {
        return disArmazenamento;
    }
    public void setDisArmazenamento(double disArmazenamento) {
        this.disArmazenamento = disArmazenamento;
    }
    public double getDisMemoria() {
        return disMemoria;
    }
    public void setDisMemoria(double disMemoria) {
        this.disMemoria = disMemoria;
    }
    public int getDisTensao() {
        return disTensao;
    }
    public void setDisTensao(int disTensao) {
        this.disTensao = disTensao;
    }
    public int getDisNumeroPortas() {
        return disNumeroPortas;
    }
    public void setDisNumeroPortas(int disNumeroPortas) {
        this.disNumeroPortas = disNumeroPortas;
    }



    
}
