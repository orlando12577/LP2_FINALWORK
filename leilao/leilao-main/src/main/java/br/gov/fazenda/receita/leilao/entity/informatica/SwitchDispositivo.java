package br.gov.fazenda.receita.leilao.entity.informatica;

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
@Table(name = "swi_switch_dispositivo")
@DiscriminatorValue("SWITCH_DISPOSITIVO")
public class SwitchDispositivo extends DispositivosInformatica{

    @Column(name = "swi_numero_portas")
    private Integer numeroPortas;
    
}
