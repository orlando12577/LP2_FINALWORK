package com.example.lp2_finalwork.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENTIDADE_FINANCEIRA")
public class EntidadeFinanceira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer entfinId;

    private String entfinNome;

    public Integer getEntfinId() {  // O nome deve ser getEntfinId
        return entfinId;
    }

    public void setEntfinId(Integer entfinId) {
        this.entfinId = entfinId;
    }

    public String getEntfinNome() {
        return entfinNome;
    }

    public void setEntfinNome(String entfinNome) {
        this.entfinNome = entfinNome;
    }
}
