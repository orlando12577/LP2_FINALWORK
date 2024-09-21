package com.example.lp2_finalwork.dtos;

import java.time.LocalDateTime;

public class LeilaoForm {
    private LocalDateTime leiDataOcorrencia;
    private LocalDateTime leiDataVisitacao;
    private String leiEndereco;
    private String leiCidade;
    private String leiEstado; // Assegure-se de que isso existe
    private String leiEnderecoWeb;

    // Getters e Setters
    public LocalDateTime getLeiDataOcorrencia() {
        return leiDataOcorrencia;
    }

    public void setLeiDataOcorrencia(LocalDateTime leiDataOcorrencia) {
        this.leiDataOcorrencia = leiDataOcorrencia;
    }

    public LocalDateTime getLeiDataVisitacao() {
        return leiDataVisitacao;
    }

    public void setLeiDataVisitacao(LocalDateTime leiDataVisitacao) {
        this.leiDataVisitacao = leiDataVisitacao;
    }

    public String getLeiEndereco() {
        return leiEndereco;
    }

    public void setLeiEndereco(String leiEndereco) {
        this.leiEndereco = leiEndereco;
    }

    public String getLeiCidade() {
        return leiCidade;
    }

    public void setLeiCidade(String leiCidade) {
        this.leiCidade = leiCidade;
    }

    public String getLeiEstado() {
        return leiEstado; // Adicione este método
    }

    public void setLeiEstado(String leiEstado) {
        this.leiEstado = leiEstado; // Adicione este método
    }

    public String getLeiEnderecoWeb() {
        return leiEnderecoWeb;
    }

    public void setLeiEnderecoWeb(String leiEnderecoWeb) {
        this.leiEnderecoWeb = leiEnderecoWeb;
    }
}

