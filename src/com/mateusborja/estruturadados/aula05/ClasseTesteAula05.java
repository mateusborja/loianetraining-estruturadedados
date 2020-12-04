/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer � 3D Artist � Developer
 * at www.mateusborja.life
 */
//aula 05 estr dados - obtendo um elemento de um vetor - classe teste
package com.mateusborja.estruturadados.aula05;

public class ClasseTesteAula05 {
	
	public static void main(String[] args) {
		
		
		Vetor arr = new Vetor(5);
		
		arr.adicionarOpcaoUm("itn");
		arr.adicionarOpcaoUm("java");
		arr.adicionarOpcaoUm("mateus");
		arr.adicionarOpcaoUm("teste");
		
		System.out.println(arr.buscarVetor(3));
		System.out.println(arr.buscaVetorApr(1)); // metodo aprimorado lancando exception
		System.out.println("Tamanho do Array: " + arr.tamanho());
		
		
		
		
	}
	
	
	
	
	

}
