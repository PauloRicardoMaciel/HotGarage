package com.HotGarage.HotGarage.transmicao;

import jakarta.validation.constraints.NotNull;

public record TransmissionSystem(
        @NotNull TipoTransnsmicao TipoTransnsmicao,
        @NotNull int quantidadeMarchas) {

}
