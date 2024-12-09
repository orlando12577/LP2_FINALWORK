package br.gov.fazenda.receita.leilao.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import br.gov.fazenda.receita.leilao.entity.status.LeilaoStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lei_leilao")
@Data
public class Leilao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lei_id")
    private Long id;

    @Column(name = "lei_data_hora")
    private LocalDateTime dataInicial;

    @Column(name = "lei_data_visitacao")
    private LocalDate dataVisitacao;

    @Column(name = "lei_descricao")
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "lei_status")
    private LeilaoStatus leilaoStatus;
    
    @OneToOne(mappedBy = "leilao")
    private Endereco endereco;

    @OneToMany(mappedBy = "leilao")
	private Set<Item> itens;
    
    @ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name = "lei_fin_id")
	private Financeira financeira;

}
