package br.gov.fazenda.receita.leilao.entity.informatica;

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
@Table(name = "hub_hub")
@DiscriminatorValue("HUB")
public class Hub extends DispositivosInformatica{

    @Column(name = "hub_numero_portas")
    private Integer numeroPortas;
    
}
