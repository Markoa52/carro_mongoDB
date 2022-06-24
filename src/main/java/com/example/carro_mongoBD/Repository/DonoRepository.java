package com.example.carro_mongoBD.Repository;

import com.example.carro_mongoBD.domain.Dono;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DonoRepository extends MongoRepository<Dono, String> {

}
