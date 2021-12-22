package com.lucas.provaLucas.api.enums;

public enum StatusEnum {
	
	ATIVO,
	INATIVO;

	public static StatusEnum getStatus(String status) {
		switch(status) {
			case "Ativo" : return ATIVO;
			case "Inativo" : return INATIVO;
			default : return ATIVO;
		}
	}
	
}
