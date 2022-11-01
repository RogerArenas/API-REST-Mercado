package com.example.Mercado.api;

import com.example.Mercado.domain.Mercado;
import com.example.Mercado.domain.MercadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mercado")
public class MercadoController {

     @Autowired
    private MercadoService service;

    @GetMapping
   public Iterable<Mercado> get () {
       return  service.getMercado();
   }



}
