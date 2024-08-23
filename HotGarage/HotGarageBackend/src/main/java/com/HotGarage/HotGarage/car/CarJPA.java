package com.HotGarage.HotGarage.car;

import com.HotGarage.HotGarage.motor.EngineJPA;
import com.HotGarage.HotGarage.transmicao.TransmissionSystemJPA;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "car")
@Entity(name = "Car")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class CarJPA {

    @Id
    @GeneratedValue
    private long id;
    private String modelo;
    private int quantidadePortas;
    private int ano;
    private float peso;
    private float altura;
    private float comprimento;
    private String caminhoFotos;
    private boolean favorito;
    private String historia;

    @Enumerated(EnumType.STRING)
    private TipoCarro tipoCarro;

    @Embedded
    private MarcaJPA Marca;
    @Embedded
    private TransmissionSystemJPA transmissionSystem;
    @Embedded
    private EngineJPA motor;

}
