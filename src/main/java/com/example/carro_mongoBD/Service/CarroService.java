package com.example.carro_mongoBD.Service;

import com.example.carro_mongoBD.domain.Carro;

import java.util.List;
import java.util.Optional;

public interface CarroService {
    public List<Carro> getCarros();
    public Optional<Carro> getCarrosById(String id);
    public List<Carro> getCarrosByTipo(String tipo);
    public Carro insert(Carro carro);
}
