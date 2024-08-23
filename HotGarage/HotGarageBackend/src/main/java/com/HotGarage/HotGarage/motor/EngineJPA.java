package com.HotGarage.HotGarage.motor;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EngineJPA {
    private String motorModelo;
    private int potencia;
    private int torque;
    private float giroMax;
    private float litragem;
    @Enumerated(EnumType.STRING)
    private FormaMontagem formaMontagem;
    @Enumerated(EnumType.STRING)
    private Aspiracao aspiracao;
}
