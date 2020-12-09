/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 11 definindo o tipo do vetor dinamicamente - classe teste
package com.mateusborja.estruturadados.aula11;

public class ClasseTesteAula11 {
	
	public static void main(String[] args) {
		
		VetorObjetos arr = new VetorObjetos(2);
		
		arr.adicionarOpcaoUm(1); // quebra o conceito pois elementos de tipos diferentes
		arr.adicionarOpcaoUm("Elemento tipo String");
		System.out.println(arr);
		
		Lista<String> vetor = new Lista<String>(1);
		vetor.adicionarOpcaoUm("Elemento");
		vetor.adicionarOpcaoUm("" + 1); // concatenado - impossivel passar valores do tipo int, pois espera passar valores do tipo String
		
		Lista<Contato> contato = new Lista<Contato>(3);
		Contato c1 = new Contato("Joao", "111 1111 1111", "mail.joao@mail.com");
		Contato c2 = new Contato("Mateus", "111 1111 1111", "mail.joao@mail.com");
		
		contato.adicionarOpcaoUm(c1);
		contato.adicionarOpcaoUm(c2);
		System.out.println(contato.imprimirVetores());
		
	}

}
