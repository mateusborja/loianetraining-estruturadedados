/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 6 verifica a existencia de um elemento em um array

package com.mateusborja.estruturadados.aula06;

import java.util.Arrays;

public class Vetor {

	private String elementos[];
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;

	}

	// opcao 1 - metodo com iteracao e checar se existem nulls(posicao vazia)
	public void adicionarOpcaoUm(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (elementos[i] == null) {
				this.elementos[i] = elemento;
				this.tamanho++;
				break;
			}

		}

	}

	// opcao 2 - metodo com cond p checar tamanho
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

	// impressao utilizando contatenacao - apenas o tamanho
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

	// metodo que busca um elemento em umarray sem excepetion e cond posicoes
	// existentes
	public String buscarVetor(int posicao) {
		return this.elementos[posicao];
	}

	// metodo que busca um elemento no array com excepetion e cond posicoes
	// existentes
	public String buscaVetorApr(int posicao) {
		if (!(posicao > 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elementos[posicao];
	}

	// metodo booleano que verifica se existe um elemento em um array
	public boolean buscarVetorBool(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i].equalsIgnoreCase(elemento)) {
				return true;
			}
		}

		return false;
	}

	// metodo que retorna um int e verifica se existe um elemento em um array
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

	// metodo que retorna uma string e verifica se existe um elemento em um array
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

}
