/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer � 3D Artist � Developer
 * at www.mateusborja.life
 */
//aula 5 obter elementos de um vetor
//lancando trhow e negando cond de posicao de existencia do vetor
package com.mateusborja.estruturadados.aula05;

import java.util.Arrays;

public class Vetor {

	private String elementos[];
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;

	}

	// opcao 1 - iteracao e checar se existem nulls
	public void adicionarOpcaoUm(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (elementos[i] == null) {
				this.elementos[i] = elemento;
				this.tamanho++;
				break;
			}

		}

	}

	// opcao 2 - cond p checar tamanho
	public void adicionarOpcaoDois(String elemento) {
		if (tamanho < elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;

		}
	}

	// opcao 3 - metodo boleano
	public boolean adicionarOpcaoTres(String elemento) {
		if (tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}

	public int getTamanho() {
		return tamanho;
	}

	public int tamanho() {
		return this.tamanho;
	}

	// impressao com contatenacao
	public String imprimirVetores() {

		String s = "[";

		for (int i = 0; i < this.tamanho - 1; i++) {
			s += this.elementos[i];
			s += ", ";
		}

		if (this.tamanho > 0) {
			s += this.elementos[this.tamanho - 1];
		}
		s += "]";
		return s;
	}

	// impressao utilizando Classe Arrays
	public String imprimirVetoresAll() {
		return Arrays.toString(elementos);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");

		}
		// cond para vetor existir
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

	// busca um elemento no array - string
	public String buscarVetor(int posicao) {
		return this.elementos[posicao];
	}

	// busca um elemento no array - string
	public String buscaVetorApr(int posicao) {
		if (!(posicao > 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elementos[posicao];
	}

}
