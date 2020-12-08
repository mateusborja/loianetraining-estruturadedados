/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 09 classe teste - removendo elemento de um vetor

package com.mateusborja.estruturadados.aula09;

public class ClasseTesteAula09 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(5);

		vetor.adicionarOpcaoDois("B");
		vetor.adicionarOpcaoDois("C");
		vetor.adicionarOpcaoDois("E");
		vetor.adicionarOpcaoDois("F");
		vetor.adicionarOpcaoDois("G");

		System.out.println("Todos os Elementos do Vetor");
		System.out.println(vetor);
		System.out.println("Removendo o elemento de Indice 4");
		vetor.removerElementoDoVetor(4);

		System.out.println(vetor.imprimirVetores());

		System.out.println("Removendo o elemento F");

		int pos = vetor.buscarVetorInt("F");
		if (pos > -1) {
			vetor.removerElementoDoVetor(pos);
		} else {
			System.out.println("Elemento não existe no Vetor");
		}

		System.out.println(vetor);

	}

}
