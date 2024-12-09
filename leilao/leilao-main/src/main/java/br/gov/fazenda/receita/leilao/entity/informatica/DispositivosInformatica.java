package br.gov.fazenda.receita.leilao.entity.informatica;

import br.gov.fazenda.receita.leilao.entity.Item;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("INFORMATICA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "NOME", discriminatorType = DiscriminatorType.STRING)
public abstract class DispositivosInformatica extends Item{
        
}
