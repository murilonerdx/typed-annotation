package com.designpattern.orm;


import com.designpattern.annotation.Tabela;

public class Orm {

	public String gerarPesquisa(Object o) {
		//Recuperar a anotação @Tabela
		Tabela anotacao = o.getClass().getAnnotation(Tabela.class);
		return "SELECT * FROM " + anotacao.nome();
	}
	
}