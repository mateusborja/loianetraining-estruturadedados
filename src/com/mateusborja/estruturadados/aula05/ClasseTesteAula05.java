/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 05 estr dados - obtendo elemento de um vetor - classe teste
package com.mateusborja.estruturadados.aula05;

public class ClasseTesteAula05 {
	
	public static void main(String[] args) {
		
		
		Vetor arr = new Vetor(4);
		
		arr.adicionarOpcaoUm("elemento1");
		arr.adicionarOpcaoUm("elemento2");
		arr.adicionarOpcaoUm("elemento3");
		
		System.out.println(arr.buscarVetor(3));
		System.out.println(arr.buscaVetorApr(4)); // metodo aprimorado lancando exception
		
		
		
	}
	
	
	
	
	

}
