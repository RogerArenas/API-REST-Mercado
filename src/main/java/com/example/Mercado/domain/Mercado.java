package com.example.Mercado.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Mercado {


       @GeneratedValue(strategy = GenerationType.IDENTITY)
       @Id
       private Long id;
       private String nome;
       private String endereço;

       private String tipo;

       public Mercado(Long id, String nome, String endereço) {
              this.id = id;
              this.nome = nome;
              this.endereço = endereço;
       }
}
