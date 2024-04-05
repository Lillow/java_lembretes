package tratamento_de_excecoes;

/**
 * ***************************
 * Tipos de Exceções: Em Java, as exceções são objetos que pertencem a classes
 * que estendem a classe Throwable. Existem dois tipos de exceções: checked
 * exceptions (exceções verificadas) e unchecked exceptions (exceções não
 * verificadas).
 *
 * Criando suas Próprias Exceções: Você também pode criar suas próprias classes
 * de exceção estendendo a classe Exception ou RuntimeException, se desejar
 * criar exceções verificadas ou não verificadas, respectivamente.
 * **************************
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClausulaFinally {

    private void lerArquivo() throws FileNotFoundException {
        File arquivo = new File("arquivo.txt");
        Scanner ler = new Scanner(arquivo);
        while (ler.hasNextLine()) {
            var linha = ler.nextLine();
            System.out.println(linha);
        }

    }

    private void fecharArquivo() {
        System.out.println("Arquivo Fechado");
    }

    public void exeArquivo() {
        try {
            // Código que pode lançar uma exceção
            lerArquivo();
        } catch (FileNotFoundException e) {
            // Código para lidar com a exceção de leitura de arquivo
            System.out.println("Arquivo não Encontrado.");

        } finally {
            // Código que será executado sempre
            fecharArquivo();

        }
    }

}
