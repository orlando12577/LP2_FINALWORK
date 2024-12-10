package br.gov.fazenda.receita.leilao.entity.informatica;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("MONITOR")
public class Monitor extends DispositivosInformatica{

    @Column(name = "mon_tipo_tela")
    private String tipoTela;

    @Column(name = "mon_tamanho")
    private Double tamanho;
    
}

