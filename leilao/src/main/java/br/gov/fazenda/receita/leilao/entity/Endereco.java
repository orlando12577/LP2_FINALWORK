package br.gov.fazenda.receita.leilao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "end_endereco")
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "end_id")
    private Long id;
    
    @Column(name = "end_estado")
    private String estado;

    @Column(name = "end_cidade")
    private String cidade;

    @Column(name = "end_bairro")
    private String bairro;

    @Column(name = "end_logradouro")
    private String logradouro;

    @Column(name = "end_numero")
    private Integer numero;

    @Column(name = "end_cep")
    private Integer cep;

    @Column(name = "end_complemento")
    private String complemento;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "end_usr_id")
    private Usuario usuario;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "end_fin_id")
    private Financeira financeira;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "end_lei_id")
    private Leilao leilao;
    
}
