/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 6 verifica a existencia de um elemento em um array - classe teste
package com.mateusborja.estruturadados.aula06;


public class ClasseTesteAula06 {

	public static void main(String[] args) {

		Vetor arr = new Vetor(5);

		arr.adicionarOpcaoUm("itn");
		arr.adicionarOpcaoUm("java");
		arr.adicionarOpcaoUm("mateus");
		arr.adicionarOpcaoUm("teste");
		
		System.out.println(arr.buscarVetorInt("nice"));
		System.out.println(arr.buscarVetorStr("nice"));
		
		
		
	}

}
