package com.treina.recife.model;



import java.util.Calendar;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Data /*gera os getters e os setters automaticamente, mas sem que possamos ver */
@Entity /*é a entidade, e a tabela no banco de dados */
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private Calendar dataNascimento;
    private boolean ativo;

}
    
