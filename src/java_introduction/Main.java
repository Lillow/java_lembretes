package java_introduction;

import java.util.ArrayList;

public class Main {
	private String teste;

	Main(String teste) {
		this.setTeste(teste);
	}

	public static void main(String[] args) {
		Introduction intro = new Introduction();

		intro.tiposPrimitivos();
		intro.arrays();
		intro.arrayLists();
		intro.loops();
		intro.casting();

		Teste teste = new Teste();
		teste.criaMain();
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

}

//-------------------------------------------------------------------------------

class Introduction {
	public static void tiposPrimitivos() {
		var stringInferencia = ""; // O tipo é definido na atribuição

		byte num1; // 8 bits | -128 a 127
		short num2; // 16 bits | -32.768 a 32.767
		int num3; // 32 bits | -2.147.483.648 a 2.147.483.647
		long num4; // 64 bits | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

		float real1; // 32 bits | (+-)1.4E-45f a (+-)3.4028235E+38f
		double real2; // 64 bits | (+-)4.9E-324 a (+-)1.7976931348623157E+308

		boolean bool; // true ou false

		char letra; // 'a', 'b', 'c', '1' ...
	}

	public static void arrays() {
		int[] numeros = new int[5]; // Declarando e inicializando array de 5 posições

		int[] initArray = { 1, 2, 3, 4 }; // Declarando e inicializando array
		initArray[0] = 2; // Trocando o valor da posição 0

		// System.out.println(numeros.length); // Tabanho do array
	}

	public static void arrayLists() {
		ArrayList<Integer> numeros = new ArrayList<Integer>(); // Declarando e inicializando arrayList
		numeros.add(31); // Adiciona um valor ao final da lista
		numeros.add(0, 42); // Adiciona um valor na posição 0 da lista

		// System.out.println(numeros.get(0));

		// numeros.remove(0); // Remove elemento da posição 0

		// System.out.println(numeros.get(0));

		// System.out.println(numeros.size());
	}

	public static void loops() {
//		for (var i = 0; i < 5; i++) {
//			System.out.println(i);
//		}

		int[] numeros = { 1, 2, 3, 4, 5, 6 };
//		for (int numero : numeros) {
//			if(numero % 2 == 0) {
//				System.out.println(numero);
//			}
//		}

		var cont = 0;

//		while ( cont <= 5) {
//			System.out.println(cont);
//			cont ++;
//		}

//		do {
//			cont ++;
//			System.out.println(cont);
//		}while(cont < 1);
//		

	}

	public static void casting() {
		// Conversão do double 5.0 para float.
		float num1 = (float) 5.0;

		// Conversão de double para int.
		int num2 = (int) 5.1987;

		// Conversão de int para float é implícito, não precisa de casting.
		float num3 = 100;

		// Conversão de char para int é implícito, não precisa de casting.
		int num4 = 'd';

		/*
		 * Casting feito implicitamente, pois o valor possui um tamanho menor que o tipo
		 * da variavel que irá recebe-lo.
		 */
		char letra1 = 'a';
		int num5 = 'b';
		float num6 = 100;

//		System.out.println(letra1); // Imprime a
//		System.out.println(num5); // Imprime 98
//		System.out.println(num6); // Imprime 100.0

		/*
		 * Casting feito explicitamente, pois o valor possui um tamanho maior que o tipo
		 * da variavel que irá recebe-lo.
		 */
		int num7 = (int) 5.1987;
		float num8 = (float) 5.0;
		int mum9 = (char) (letra1 + 5);
		char letra2 = (char) 110.5;

//		System.out.println(num7); // Imprime 5
//		System.out.println(num8); // Imprime 5.0
//		System.out.println(mum9); // Imprime 102
//		System.out.println(letra2); // Imprime n

		String texto = String.valueOf(letra1); // Character em string
		letra2 = texto.charAt(0); // String em character
		texto = String.valueOf(mum9); // Inteiro em string
		num1 = Integer.parseInt(texto); // String em inteiro
//		System.out.println(letra2);

	}
}

//-------------------------------------------------------------------------------

class Teste {
	private String mome = "";

	void criaMain() {
		Main main = new Main("Teste de objetos");
		System.out.println(main.getTeste());
	}
}