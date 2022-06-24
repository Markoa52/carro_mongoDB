package com.example.carro_mongoBD.Service;

import com.example.carro_mongoBD.Repository.CarroRepository;
import com.example.carro_mongoBD.Repository.DonoRepository;
import com.example.carro_mongoBD.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Optional;

@Service
public class CarroServiceImpl implements CarroService {
    @Autowired
    private CarroRepository repository;
    @Autowired
    private DonoRepository rep;

    public CarroServiceImpl(CarroRepository repository, DonoRepository rep) {
        this.repository = repository;
        this.rep = rep;
    }
    @Override
    public List<Carro> getCarros() {return this.repository.findAll();}

    @Override
    public Optional<Carro> getCarrosById(String id) {
        return Optional.ofNullable(this.repository
                .findById(String.valueOf(id))
                .orElseThrow(() -> new IllformedLocaleException("Carro não existe")));
    }
    @Override
    public List<Carro> getCarrosByTipo(String tipo) {
        return this.repository.findByTipo(tipo);
    }
    @Override
    public Carro insert(Carro carro) {

        Dono dono = this.rep
                .findById(carro.getDono().getId())
                .orElseThrow(()-> new IllformedLocaleException("Dono inexitente"));

        carro.setDono(dono);

        return this.repository.save(carro);
    }
}
