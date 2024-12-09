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
@Table(name = "cam_caminhao")
@DiscriminatorValue("CAMINHAO")
public class Caminhao extends Veiculo{

    @Column(name = "cam_numero_eixo")
    private Integer numeroEixos;
    
}
