package com.example.lp2_finalwork.entity.Informatica;

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
    @Table(name = "rot_roteador")
    @DiscriminatorValue("ROTEADOR")
    public class Roteador extends DispositivosInformatica{
    
        @Column(name = "rot_frequencia")
        private Double frequencia;
        
    }