package com.example.carro_mongoBD.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document()
@Data
public class Carro {

    @Id
    private String id;
    private String nome;
    private String tipo;
    @DBRef
    private Dono dono;

}
