package com.HotGarage.HotGarage.car;

import jakarta.validation.constraints.NotBlank;

public record Marca(
        @NotBlank String nomeMarca,
        @NotBlank String caminhoLogo) {

}
