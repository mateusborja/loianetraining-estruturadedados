/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 03 adicionando elemento ao vetor
package com.mateusborja.estruturadados.aula03;

public class Vetor {
	
	private String elementos[];
	private int tamanho;
	
	
	public Vetor(int capacidade) {
		this.elementos = new String [capacidade];
		this.tamanho = 0;
		
	}
	
	public void adicionarOpcaoUm(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if(elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
			
		}
		
	}
	
	public void adicionarOpcaoDois (String elemento) {
		if(tamanho < elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;
			
		}
	}

}
