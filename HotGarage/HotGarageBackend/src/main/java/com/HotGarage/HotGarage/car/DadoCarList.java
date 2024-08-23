package com.HotGarage.HotGarage.car;

public record DadoCarList(MarcaJPA marca, String nome, TipoCarro tipoCarro, int ano, boolean favorito) {

    public DadoCarList(CarJPA carJPA) {
        this(carJPA.getMarca(), carJPA.getModelo(), carJPA.getTipoCarro(), carJPA.getAno(), carJPA.isFavorito());
    }

}
