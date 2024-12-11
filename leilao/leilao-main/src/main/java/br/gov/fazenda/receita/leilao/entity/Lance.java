package br.gov.fazenda.receita.leilao.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lan_lance")
@Data
@NoArgsConstructor  // Adiciona um construtor padrão
public class Lance implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lan_id")
    private Long id;

    @Column(name = "lan_valor", nullable = false)
    private Double valorLance;

    @Column(name = "lan_data_hora", nullable = false, updatable = false)
    private LocalDateTime datahora;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "lan_itm_id", nullable = false)
    private Item item;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "lan_usr_id", nullable = false)
    private Usuario usuario;

    // Construtor com parâmetros
    public Lance(Usuario usuario, Item item, Double valorLance) {
        this.usuario = usuario;
        this.item = item;
        this.valorLance = valorLance;
    }

    // Garante que a data e hora sejam atribuídas automaticamente antes de persistir
    @PrePersist
    protected void onCreate() {
        this.datahora = LocalDateTime.now();
    }
}
