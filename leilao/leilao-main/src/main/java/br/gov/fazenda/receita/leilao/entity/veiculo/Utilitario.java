package br.gov.fazenda.receita.leilao.entity.veiculo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "uti_utilitario")
@DiscriminatorValue("UTILITARIO")
public class Utilitario extends Veiculo{

    @Column(name = "uti_capacidade_carga")
    private Double capacidadeCarga;
    
}
