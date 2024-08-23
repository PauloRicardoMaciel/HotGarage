package com.HotGarage.HotGarage.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HotGarage.HotGarage.car.CarJPA;
import com.HotGarage.HotGarage.car.CarRepository;
import com.HotGarage.HotGarage.car.DadoCarList;

@RestController
@RequestMapping("cars")
public class CarsContoller {
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public Page<DadoCarList> procurarCarro(@PageableDefault(size = 10, sort = { "modelo" }) Pageable paginacao) {
        return carRepository.findAll(paginacao).map(DadoCarList::new);
    }

    @GetMapping("/modelo={modelo}")
    public List<CarJPA> buscarPorModelo(@PathVariable String modelo,
            @PageableDefault(size = 10, sort = { "modelo" }) Pageable paginacao) {
        return carRepository.buscarPorModelo(modelo);
    }

    @GetMapping("/tipo={tipo}")
    public List<CarJPA> buscarPorTipo(@PathVariable String tipo,
            @PageableDefault(size = 10, sort = { "modelo" }) Pageable paginacao) {
        return carRepository.buscarPorTipo(tipo);
    }

    @GetMapping("/ano={ano}")
    public List<CarJPA> buscarPorAno(@PathVariable int ano,
            @PageableDefault(size = 10, sort = { "modelo" }) Pageable paginacao) {
        return carRepository.buscarPorAno(ano);
    }

    @GetMapping("/favorito")
    public List<CarJPA> buscarPorFavorito(@PageableDefault(size = 10, sort = { "modelo" }) Pageable paginacao) {
        return carRepository.buscarPorFavorito();
    }

}
