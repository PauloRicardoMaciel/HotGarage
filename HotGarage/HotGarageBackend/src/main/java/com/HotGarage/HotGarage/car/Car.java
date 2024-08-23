package com.HotGarage.HotGarage.car;

import com.HotGarage.HotGarage.motor.Engine;
import com.HotGarage.HotGarage.transmicao.TransmissionSystem;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Car(
        @NotBlank String modelo,
        @NotNull int quantidadePortas,
        @NotNull int ano,
        @NotNull float peso,
        @NotNull float altura,
        @NotNull float comprimento,
        @NotBlank String caminhoFotos,
        @NotNull boolean favorito,
        @NotBlank String historia,
        @NotNull TipoCarro tipoCarro,
        @NotNull @Valid Marca Marca,
        @NotNull @Valid Engine motor,
        @NotNull @Valid TransmissionSystem transmissionSystem) {

}
