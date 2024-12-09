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
@Table(name = "not_notebook")
@DiscriminatorValue("NOTEBOOK")
public class Notebook extends DispositivosInformatica{

    @Column(name = "not_marca")
    private String marca;

    @Column(name = "not_memoria_ram")
    private Integer memoriaRam;
    
}

