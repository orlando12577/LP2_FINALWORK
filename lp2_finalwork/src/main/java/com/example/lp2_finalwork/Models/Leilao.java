package com.example.lp2_finalwork.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "LEILAO")
public class Leilao {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer leilaoId;
	
	private LocalDateTime leilaoDataOcorrencia;
	
	private LocalDateTime leilaoDataVisitacao;
	
	private String leilaoEndereco;
	
	private String leilaoCidade;
	
	private String leilaoEstado;
	
	private String leilaoEnderecoWeb;

    @ManyToMany
    @JoinTable(
    		name="leilao_entidade_financeira",
    		joinColumns= @JoinColumn(name = "leilaoId"), 
    		inverseJoinColumns=@JoinColumn(name="entidadefinId"))
	private List<EntidadeFinanceira> entidadesFinanceiras;
	
	public Leilao() {}
	
	
	public Leilao(LocalDateTime leilaoDataOcorrencia, LocalDateTime leilaoDataVisitacao, String leilaoEndereco, String leilaoCidade, String leilaoEstado,
			String leilaoEnderecoWeb, List<EntidadeFinanceira> entidadeFinanceiras) {
		super();
		this.leilaoDataOcorrencia = leilaoDataOcorrencia;
		this.leilaoDataVisitacao = leilaoDataVisitacao;
		this.leilaoEndereco = leilaoEndereco;
		this.leilaoCidade = leilaoCidade;
		this.leilaoEstado = leilaoEstado;
		this.leilaoEnderecoWeb = leilaoEnderecoWeb;
		this.entidadesFinanceiras = entidadeFinanceiras;
	}
	
    public Integer getLeilaoId() {
        return leilaoId;
    }


    public void setLeilaoId(Integer leilaoId) {
        this.leilaoId = leilaoId;
    }


    public LocalDateTime getLeilaoDataOcorrencia() {
        return leilaoDataOcorrencia;
    }


    public void setLeilaoDataOcorrencia(LocalDateTime leilaoDataOcorrencia) {
        this.leilaoDataOcorrencia = leilaoDataOcorrencia;
    }


    public LocalDateTime getLeilaoDataVisitacao() {
        return leilaoDataVisitacao;
    }


    public void setLeilaoDataVisitacao(LocalDateTime leilaoDataVisitacao) {
        this.leilaoDataVisitacao = leilaoDataVisitacao;
    }


    public String getLeilaoEndereco() {
        return leilaoEndereco;
    }


    public void setLeilaoEndereco(String leilaoEndereco) {
        this.leilaoEndereco = leilaoEndereco;
    }


    public String getLeilaoCidade() {
        return leilaoCidade;
    }


    public void setLeilaoCidade(String leilaoCidade) {
        this.leilaoCidade = leilaoCidade;
    }


    public String getLeilaoEstado() {
        return leilaoEstado;
    }


    public void setLeilaoEstado(String leilaoEstado) {
        this.leilaoEstado = leilaoEstado;
    }


    public String getLeilaoEnderecoWeb() {
        return leilaoEnderecoWeb;
    }


    public void setLeilaoEnderecoWeb(String leilaoEnderecoWeb) {
        this.leilaoEnderecoWeb = leilaoEnderecoWeb;
    }
    
}
