/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 02 vetor classe def
package com.mateusborja.estruturadados.aula02;

public class Vetor {
	
	private String elementos[];
	private int tamanho;
	
	
	public Vetor(int capacidade) {
		this.elementos = new String [capacidade];
		this.tamanho = 0;
		
	}
	
	public int getTamanho() {
		return tamanho;
	}

}
