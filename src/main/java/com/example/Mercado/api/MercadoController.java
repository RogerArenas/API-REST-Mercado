package com.example.Mercado.api;

import com.example.Mercado.domain.Mercado;
import com.example.Mercado.domain.MercadoService;
import com.example.Mercado.domain.dto.MercadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/mercado")
public class MercadoController {

     @Autowired
    private MercadoService service;

    @GetMapping
   public ResponseEntity get () {
      return ResponseEntity.ok( service.getMercado( ) );
   }

    @GetMapping("/{id}")
    public ResponseEntity < Optional<Mercado>>getMercadoById ( @PathVariable("id")Long id ) {
          Optional<Mercado> mercado = service.getMercadoById(id);

          if ( mercado.isPresent() ){
              Mercado mec = mercado.get();
              return ResponseEntity.ok( service.getMercadoById( id ));
          }else {
              return ResponseEntity.notFound().build();
          }




    }

    @GetMapping("/tipo/{tipo}")
    public Iterable<Mercado> getMercadoByTipo(@PathVariable("tipo")String tipo){
        return service.getMercadoByTipo(tipo);
    }
    @PostMapping
    public String post( @RequestBody Mercado mercado) {
       Mercado c =  service.save(mercado);
       return "Salvo com sucesso: " + c.getId();
    }

    @PutMapping("{id}")
    public String put(@PathVariable("id")Long id, @RequestBody Mercado mercado) {
        Mercado c =  service.update(mercado, id );
        return "Alterado com sucesso: " + c.getId();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        service.delete(id);

      return "Dados deletados com sucesso";

    }
}
