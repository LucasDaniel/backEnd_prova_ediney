package com.example.provaLucas.entity;

import org.springframework.data.annotation.Id;

public class Remedio {

	@Id
	private String id;
	
	private String nome;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
