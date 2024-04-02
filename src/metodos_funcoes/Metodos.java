package metodos_funcoes;

public class Metodos {
	// Declaração de um método simples
	public void exibirMensagem() {
		System.out.println("Olá, mundo!");
	}

	public void testeMetodo() {
		// Chamada do método exibirMensagem
		exibirMensagem();

	}

	// Método que recebe dois números inteiros e retorna sua soma
	public int somar(int a, int b) {
		return a + b;
	}

	// Método estático que imprime uma mensagem
	public static void imprimirMensagem() {
		System.out.println("Esta é uma mensagem estática.");
	}

}
