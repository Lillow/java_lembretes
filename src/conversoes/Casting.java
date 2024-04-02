package conversoes;

public class Casting {
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
