package com.example.carro_mongoBD.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
@Data
public class Dono {
    @Id
    private String id;
    private String nome;
    private String equipe;
}
