/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 10 - generalizando o tipo vetor com a Superclasse Object
package com.mateusborja.estruturadados.aula10;

public class ClasseTesteAula10 {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3);
		vetor.adicionarOpcaoUm(3); // passar tipo primitivo par aum obj autoboxing
		vetor.adicionarOpcaoUm(4);
		vetor.adicionarOpcaoUm(5);

		System.out.println("Tamanho = " + vetor.getTamanho());
		System.out.println(vetor);

		Contato c1 = new Contato("Contato 1", "12 2345 7890", "contato1@mail.com");
		Contato c2 = new Contato("Contato 2", "34 5678 9012", "contato2@mail.com");
		Contato c3 = new Contato("Contato 3", "56 7890 1234", "contato3@mail.com");
		Contato c4 = new Contato("Contato 4", "78 9012 3456", "contato4@mail.com");

		vetor.adicionarOpcaoTres(c1);
		vetor.adicionarOpcaoTres(c2);
		vetor.adicionarOpcaoTres(c3);

		System.out.println(vetor);

		int pos = vetor.buscarVetorInt(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");

		}

	}

}
