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
import java.io.IOException;

public class ClausulaFinally {

    private void lerArquivo() {
        System.out.println("");
    }

    private void fecharArquivo() {
        System.out.println("");
    }

    public void exeArquivo() {
        try {
            // Código que pode lançar uma exceção
            lerArquivo();
        } catch (Exception e) {
            // Código para lidar com a exceção de leitura de arquivo
        } finally {
            // Código que será executado sempre
            fecharArquivo();
        }
    }

}
