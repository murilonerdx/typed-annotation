package com.designpattern;


import com.designpattern.bean.Aluno;
import com.designpattern.bean.Cliente;
import com.designpattern.orm.Orm;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar um aluno e um orm
		Aluno aluno = new Aluno();
		Cliente cliente = new Cliente();
		Orm orm = new Orm();
		
		//Chamar o método de gerarPesquisa passando o aluno
		System.out.println(orm.gerarPesquisa(aluno));
		System.out.println(orm.gerarPesquisa(cliente));
	}
	
}
