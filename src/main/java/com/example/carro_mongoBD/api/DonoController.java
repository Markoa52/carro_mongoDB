package com.example.carro_mongoBD.api;

import com.example.carro_mongoBD.domain.Dono;
import com.example.carro_mongoBD.Service.DonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/dono")
public class DonoController {

    @Autowired
    private DonoService Service;

    @GetMapping()
    public List<Dono> getCarros() {return this.Service.getDono();}

    @GetMapping("/{id}")
    public Optional<Dono> getCarrosById(@PathVariable String id) {
        return this.Service.getDonoById(id);
    }

    @GetMapping("/equipe/{equipe}")
    public Optional<Dono> getCarrosByTipo(@PathVariable String equipe) {
        return this.Service.getDonoByEquipe(equipe);
    }

    @PostMapping
    public Dono insert(@RequestBody Dono dono){
        return this.Service.insert(dono);
    }
}


