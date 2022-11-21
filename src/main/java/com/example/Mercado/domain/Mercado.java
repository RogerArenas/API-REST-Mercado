package com.example.Mercado.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Mercado {

       @GeneratedValue(strategy = GenerationType.IDENTITY)
       @Id
       private Long id;
       private String nome;
       private String endereço;
       private String tipo;





}
