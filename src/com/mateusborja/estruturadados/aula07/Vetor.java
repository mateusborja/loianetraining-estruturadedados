/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer � 3D Artist � Developer
 * at www.mateusborja.life
 */
//aula 7 adicionando elemento em qlqr posicao em um vetor

package com.mateusborja.estruturadados.aula07;

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
			throw new IllegalArgumentException("Posiçãoo inválida!");
		}
		return this.elementos[posicao];
	}

	// verifica se existe um elemento no array - bool
	public boolean buscarVetorBool(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i].equalsIgnoreCase(elemento)) {
				return true;
			}
		}

		return false;
	}

	// verifica se existe um elemento no array - int
	public int buscarVetorInt(String elemento) {
		try {
			for (int i = 0; i < this.elementos.length; i++) {
				if (this.elementos[i].equalsIgnoreCase(elemento)) {
					return i;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Elemento Inexistente!");
		}
		return -1;
	}

	// verifica se existe um elemento no array - string
	public String buscarVetorStr(String elemento) {
		try {
			for (int i = 0; i < this.elementos.length; i++) {
				if (this.elementos[i].equalsIgnoreCase(elemento))
					return "Posição: [ " + i + " ].";
			}
		} catch (NullPointerException e) {
			System.out.println("");
		}
		return "Elemento Inexistente!";
	}

	// adiciona um elemento em qlqr posicao no vetor
	public boolean adicionarVetorQlqrPos(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao <= this.tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		for (int i = this.tamanho - 1; i >= posicao; i--) { //iteracao de tras p frente
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

}
