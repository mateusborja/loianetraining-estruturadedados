/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 04 lendo e imprimindo vetor - classe teset
package com.mateusborja.estruturadados.aula04;

public class ClasseTesteAula04 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(8);
		vetor.adicionarOpcaoUm("elemento1");
		vetor.adicionarOpcaoDois("elemento2");
		vetor.adicionarOpcaoDois("elemento3");
		vetor.adicionarOpcaoTres("elemento4");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.imprimirVetores());
		System.out.println(vetor.imprimirVetoresAll());
		System.out.println(vetor);

	}

}
