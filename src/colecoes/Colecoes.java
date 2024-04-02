package colecoes;

import java.util.ArrayList;

public class Colecoes {
	public static void arrays() {
		int[] numeros = new int[5]; // Declarando e inicializando array de 5 posições

		int[] initArray = { 1, 2, 3, 4 }; // Declarando e inicializando array
		initArray[0] = 2; // Trocando o valor da posição 0

		System.out.println(numeros.length); // Tabanho do array
	}

	public void matriz() {

		// Declaração de uma matriz 2x3
		int[][] matriz = new int[2][3];

		// Inicialização e atribuição de valores
		matriz[0][0] = 1;
		matriz[0][1] = 2;
	}

	public static void arrayLists() {
		ArrayList<Integer> numeros = new ArrayList<Integer>(); // Declarando e inicializando arrayList
		numeros.add(31); // Adiciona um valor ao final da lista
		numeros.add(0, 42); // Adiciona um valor na posição 0 da lista

		System.out.println(numeros.get(0));

		numeros.remove(0); // Remove elemento da posição 0

		System.out.println(numeros.get(0));

		System.out.println(numeros.size());
	}

}
