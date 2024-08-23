package com.HotGarage.HotGarage.motor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Engine(
        @NotBlank String modelo,
        @NotNull int potencia,
        @NotNull int torque,
        @NotNull float giroMax,
        @NotNull float faixaTorque,
        @NotNull float litragem,
        @NotNull FormaMontagem formaMontagem,
        @NotNull Aspiracao aspiracao) {

}
