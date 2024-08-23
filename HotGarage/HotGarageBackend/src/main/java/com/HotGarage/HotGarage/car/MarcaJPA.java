package com.HotGarage.HotGarage.car;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MarcaJPA {
    private String nomeMarca;
    private String caminhoLogo;

}
