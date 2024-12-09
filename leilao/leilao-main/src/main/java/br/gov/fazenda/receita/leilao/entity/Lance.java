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
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lan_lance")
@Data
public class Lance implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="lan_id")
    private Long id;
    
    @Column(name = "lan_valor")
    private Double valorLance;

    @Column(name = "lan_data_hora")
    private LocalDateTime datahora;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "lan_itm_id")
    private Item item;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "lan_usr_id")
    private Usuario usuario;


    public Lance(Usuario usuario, Item item, Double valorLance){
        this.usuario = usuario;
        this.item = item;
        this.valorLance = valorLance;
        this.datahora = LocalDateTime.now();
    }
}
