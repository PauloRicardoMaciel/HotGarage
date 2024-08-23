package com.HotGarage.HotGarage.car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository extends JpaRepository<CarJPA, Long> {

    @Query(value = "select * from car where car.modelo like %?1%")
    List<CarJPA> buscarPorModelo(String modelo);

    @Query(value = "select * from car where car.tipo == ?1")
    List<CarJPA> buscarPorTipo(String tipo);

    @Query(value = "select * from car where car.ano == ?1")
    List<CarJPA> buscarPorAno(int ano);

    @Query(value = "select * from car where car.favorito == true")
    List<CarJPA> buscarPorFavorito();

}
