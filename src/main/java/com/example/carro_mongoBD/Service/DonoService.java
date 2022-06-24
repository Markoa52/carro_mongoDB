package com.example.carro_mongoBD.Service;

import com.example.carro_mongoBD.domain.Dono;

import java.util.List;
import java.util.Optional;

public interface DonoService {

    public List<Dono> getDono();
    public Optional<Dono> getDonoById(String id);
    public Optional<Dono> getDonoByEquipe(String tipo);
    public Dono insert(Dono dono);
}
