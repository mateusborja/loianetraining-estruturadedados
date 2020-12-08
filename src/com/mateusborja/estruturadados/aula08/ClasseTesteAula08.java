/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 08 classe teste
package com.mateusborja.estruturadados.aula08;

public class ClasseTesteAula08 {
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adicionarOpcaoDois("B");
		vetor.adicionarOpcaoDois("C");
		vetor.adicionarOpcaoDois("E");
		vetor.adicionarOpcaoDois("F");
		vetor.adicionarOpcaoDois("G");
		
		System.out.println(vetor.imprimirVetoresAll());

		
	}

}
