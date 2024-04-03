package tratamento_de_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ***************************
 * O que é uma Exceção: Uma exceção é um evento que interrompe o fluxo normal de
 * execução de um programa. Exemplos de exceções incluem divisão por zero,
 * acesso a um índice inválido em um array e tentativa de abrir um arquivo que
 * não existe.
 *
 * Blocos try-catch: Em Java, você pode lidar com exceções usando blocos
 * try-catch. O código que pode lançar uma exceção é colocado dentro do bloco
 * try, e o código para lidar com a exceção é colocado dentro do bloco catch.
 * **************************
 */
public class Excecao {

    public int entrada() {
        Scanner leia = new Scanner(System.in);
        int num = 0;

        try {
            System.out.println("Digite um número inteiro: ");
            num = leia.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Precisa ser um núemro inteiero válido. ");
        }

        return num;
    }

    public int dividir(int num1, int num2) {
        int resultado = 0;
        try {
            resultado = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }
        return resultado;
    }

}
