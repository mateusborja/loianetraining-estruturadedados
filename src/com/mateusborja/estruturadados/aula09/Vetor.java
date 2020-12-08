/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer ï¿½ 3D Artist ï¿½ Developer
 * at www.mateusborja.life
 */
//aula 9 removendo a posicao do elemento no vetor

package com.mateusborja.estruturadados.aula09;

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
		this.aumentaCapacidade();
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
		this.aumentaCapacidade();
		if (tamanho < elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;

		}
	}

	// opcao 3 - metodo boleano
	public boolean adicionarOpcaoTres(String elemento) {
		this.aumentaCapacidade();
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
			throw new IllegalArgumentException("PosiÃ§Ã£oo invÃ¡lida!");
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
			throw new IllegalArgumentException("PosiÃ§Ã£o InvÃ¡lida!");
		}

		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) { // iteracao de tras p frente
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	// aumenta a capacidade do vetor
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String elementosNovos[] = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) { // iteracao pode ser this.tamanho ou this.elementos.length
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	// revomendo elemento de um vetor
	// B G D E F - remover o G indice [1]
	// 0 1 2 3 4 = tamanho 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor [3]
	// vetor[3] = vetor[4]
	public void removerElementoDoVetor(int posicao) {
		if (!(posicao > 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

}
