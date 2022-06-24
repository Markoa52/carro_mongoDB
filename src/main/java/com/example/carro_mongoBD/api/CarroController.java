package com.example.carro_mongoBD.api;

import com.example.carro_mongoBD.domain.Carro;
import com.example.carro_mongoBD.Service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/carros")
public class CarroController {
    @Autowired
    private CarroService Service;

    public CarroController(CarroService service) {Service = service;}

    @GetMapping()
    public List<Carro> getCarros() {return this.Service.getCarros();}

    @GetMapping("/{id}")
    public Optional<Carro> getCarrosById(@PathVariable String id) {
        return this.Service.getCarrosById(id);
    }

    @GetMapping("/tipo/{tipo}")
    public List<Carro> getCarrosByTipo(@PathVariable String tipo) {
        return this.Service.getCarrosByTipo(tipo);
    }

    @PostMapping
    public Carro insert(@RequestBody Carro carro){
        return this.Service.insert(carro);
    }

}

