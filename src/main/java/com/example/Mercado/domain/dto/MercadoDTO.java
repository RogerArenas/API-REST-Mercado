package com.example.Mercado.domain.dto;

import com.example.Mercado.domain.Mercado;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
@NoArgsConstructor
public class MercadoDTO {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String nome;
	private String endereço;
	private String tipo;

	public MercadoDTO( Mercado ms ) {
		this.id= ms.getId();
		this.nome = ms.getNome();
		this.endereço = ms.getEndereço();
		this.tipo = ms.getTipo();

	}
}
