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
@Table(name = "mot_motocicleta")
@DiscriminatorValue("MOTOCICLETA")
public class Motocicleta extends Veiculo{

    @Column(name = "mot_cilindrada")
    private Integer cilindrada;
    
}
