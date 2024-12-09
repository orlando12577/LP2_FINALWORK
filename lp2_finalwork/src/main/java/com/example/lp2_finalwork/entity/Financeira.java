package br.gov.fazenda.receita.leilao.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fin_financeira")
@Data
public class Financeira {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fin_id")
    private Long id;

    @Column(name = "fin_cnpj")
    private String cnpj;

    @Column(name = "fin_nome")
    private String nome;

    @Column(name = "fin_razao_social")
    private String razaoSocial;

    @Column(name = "fin_email")
    private String email;

    @Column(name = "fin_telefone")
    private String telefone;

    @OneToOne(mappedBy = "financeira")
    private Endereco endereco;

    @JsonIgnore
    @OneToMany(mappedBy = "financeira")
	private Set<Leilao> leiloes;

}
