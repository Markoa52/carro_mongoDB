package com.example.carro_mongoBD.Service;

import com.example.carro_mongoBD.domain.Dono;
import com.example.carro_mongoBD.Repository.DonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Optional;

@Service
public class DonoServiceImpl implements DonoService {
    @Autowired
    private DonoRepository repository;

    public DonoServiceImpl(DonoRepository repository) {this.repository = repository;}
    @Override
    public List<Dono> getDono() {
        return this.repository.findAll();
    }
    @Override
    public Optional<Dono> getDonoById(String id) {
        return Optional.ofNullable(this.repository.
                findById(id)
                .orElseThrow(() -> new IllformedLocaleException("Dono inexistente")));
    }
    @Override
    public Optional<Dono> getDonoByEquipe(String tipo) {
        return Optional.ofNullable(this.repository.
                findById(tipo)
                .orElseThrow(() -> new IllformedLocaleException("Dono inexistente")));
    }
    @Override
    public Dono insert(Dono dono) {
        return this.repository.save(dono);
    }
}
