package com.example.carro_mongoBD.Repository;

import com.example.carro_mongoBD.domain.Carro;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CarroRepository extends MongoRepository<Carro, String> {
    List<Carro> findByTipo(String tipo);
}