/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 12 - classe arraylist java - classe teste 
package com.mateusborja.estruturadados.aula12;

import java.util.ArrayList;

public class ClasseTesteAula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);

		arrayList.add(1, "B");
		System.out.println(arrayList);

		boolean existe = arrayList.contains("D");
		if (existe) {
			System.out.println("Elemento existe na Lista");
		} else {
			System.out.println("Elemento não existe na Lista");

		}

		arrayList.add("D");
		System.out.println();
		int pos = arrayList.indexOf("E");
		if (pos > -1) {
			System.out.println("Elemento " + arrayList.get(1) + " existe na Lista => Indice: " + pos);

		} else {
			System.out.println("Elemento não existe na Lista => Indice: " + pos);

		}

		System.out.println("Indice 0: " + arrayList.get(0)); // metodo de busca get(Indice);
		System.out.println(arrayList);
		

	}

}
