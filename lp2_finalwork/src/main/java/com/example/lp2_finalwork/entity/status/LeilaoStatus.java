package com.example.lp2_finalwork.entity.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum LeilaoStatus {
    
    EM_ABERTO("Em Aberto"),
    EM_ANDAMENTO("Em Andamento"),
    FINALIZADO("Fechado");

    private String status;

}
