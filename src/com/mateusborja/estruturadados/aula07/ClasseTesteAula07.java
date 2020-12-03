/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 07 classe teste
package com.mateusborja.estruturadados.aula07;

public class ClasseTesteAula07 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adicionarOpcaoDois("B");
		vetor.adicionarOpcaoDois("C");
		vetor.adicionarOpcaoDois("E");
		vetor.adicionarOpcaoDois("F");
		vetor.adicionarOpcaoDois("G");

		System.out.println(vetor);

		vetor.adicionarVetorQlqrPos(0, "A");
		System.out.println(vetor);

		vetor.adicionarVetorQlqrPos(3, "D");
		System.out.println(vetor);

	}

}
