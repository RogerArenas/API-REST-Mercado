package com.example.Mercado.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MercadoService {

    @Autowired
    public MercadoRepository repository;

    public Iterable<Mercado> getMercado() {
        return repository.findAll();

    }
        public List<Mercado> getListFake() {
         List <Mercado> mercados = new ArrayList<>();

         mercados.add(new Mercado(1L,"PagMenos","Rua 01"));
         mercados.add(new Mercado(2L,"BemBarato","Rua 02"));
         mercados.add(new Mercado(3L,"Tenda","Rua 03"));


        return mercados;
    }
}
