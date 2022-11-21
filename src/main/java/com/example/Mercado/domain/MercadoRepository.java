package com.example.Mercado.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoRepository extends JpaRepository<Mercado,Long > {


	Iterable< Mercado> findByTipo( String tipo );
}
