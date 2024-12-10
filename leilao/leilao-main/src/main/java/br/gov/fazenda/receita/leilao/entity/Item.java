package br.gov.fazenda.receita.leilao.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "itm_item")
@DiscriminatorColumn(name = "TIPO_ITEM", discriminatorType = DiscriminatorType.STRING)
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itm_id")
    protected Long id;

    @Column(name = "itm_nome")
    protected String nome;

    @Column(name = "itm_maior_lance")
    protected Double maiorLance;

    @Column(name = "itm_valor_inicial")
    protected Double valorInicial;

    @Column(name = "vei_marca")
    protected String marca;

    @Column(name = "vei_modelo")
    protected String modelo;

    @Column(name = "vei_cor")
    protected String cor;

    @Column(name = "vei_combustivel")
    protected String combustivel;

    @OneToMany(mappedBy = "item") // Relacionamento com Lance
    protected List<Lance> historicoLances = new ArrayList<>();

    @ManyToOne // Relacionamento com Leilao
    @JoinColumn(name = "itm_lei_id", nullable = false)
    protected Leilao leilao;

    // getters e setters e construtores = @Data
}
