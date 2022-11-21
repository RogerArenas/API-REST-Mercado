package com.example.Mercado.domain;

import com.example.Mercado.domain.dto.MercadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MercadoService {

    @Autowired
    public MercadoRepository repository;

    public List<MercadoDTO> getMercado() {
         return repository.findAll().stream().map(MercadoDTO::new).collect(Collectors.toList());

    }

    public Optional<Mercado> getMercadoById(Long id) {
        return repository.findById(id);
    }


    public Iterable< Mercado> getMercadoByTipo( String tipo ) {
        return repository.findByTipo( tipo );
    }

    public Mercado save( Mercado mercado ) {
        return repository.save( mercado );
    }

    public Mercado update( Mercado mercado, Long id ) {
        //Assert.isNotNull( id,"Não foi possivel atualizar registro" );

        Optional<Mercado> optional = getMercadoById( id );
        if ( optional.isPresent() )
        {
            Mercado db = optional.get();
            db.setNome( mercado.getNome( ));
            db.setTipo( mercado.getTipo( ));
            db.setEndereço( mercado.getEndereço());
            System.out.println( "Carro ID"+ db.getId() );

            repository.save( db );
            return db;
        }
        else {
            throw new RuntimeException( "Não foi possivel atualizar cadastro" );
             }
    }

    public void delete( Long id ) {

        Optional<Mercado> optional = getMercadoById( id );
        if (optional.isPresent())  {
             repository.deleteById( id );
        }
    }
}
