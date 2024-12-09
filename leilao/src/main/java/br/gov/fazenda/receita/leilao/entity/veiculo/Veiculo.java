package br.gov.fazenda.receita.leilao.entity.veiculo;

import br.gov.fazenda.receita.leilao.entity.Item;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.DiscriminatorType;

@Getter
@Setter
@Entity
@DiscriminatorValue("VEICULO")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "NOME", discriminatorType = DiscriminatorType.STRING)
public abstract class Veiculo extends Item{

}
