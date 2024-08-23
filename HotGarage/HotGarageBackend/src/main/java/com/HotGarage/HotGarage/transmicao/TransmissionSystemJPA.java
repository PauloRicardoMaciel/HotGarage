package com.HotGarage.HotGarage.transmicao;

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
public class TransmissionSystemJPA {
    private int quantidadeMarchas;
    @Enumerated(EnumType.STRING)
    private TipoTransnsmicao TipoTransnsmicao;

}
