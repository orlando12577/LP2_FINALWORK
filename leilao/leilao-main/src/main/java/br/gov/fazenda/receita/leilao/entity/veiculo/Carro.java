package br.gov.fazenda.receita.leilao.entity.veiculo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car_carro")
@DiscriminatorValue("CARRO")
public class Carro extends Veiculo{

    @Column(name = "car_numero_porta")
    private Integer numeroPortas;
    
}
