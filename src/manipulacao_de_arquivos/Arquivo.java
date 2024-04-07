package manipulacao_de_arquivos;

/**
 * ************************
 * Classes para Manipulação de Arquivos: Em Java, as classes mais comuns para
 * manipulação de arquivos estão no pacote java.io. Duas classes principais são
 * File e FileInputStream/FileOutputStream para operações de entrada/saída de
 * arquivos, respectivamente.
 *
 *********************
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Arquivo {

    /**
     * ********************************
     * Leitura de Arquivos: Você pode usar a classe FileInputStream ou Scanner
     * para ler dados de um arquivo em Java. O método mais comum é usar Scanner
     * para facilitar a leitura de diferentes tipos de dados.
     * *******************************
     */
    public void lerFile(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner ler = new Scanner(arquivo);

            while (ler.hasNextLine()) {
                String linha = ler.nextLine();

                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado");
        }

    }

    public void lerFileReader(String nomeArquivo) {
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            Scanner ler = new Scanner(arquivo);

            while (ler.hasNextLine()) {
                String linha = ler.nextLine();

                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado");
        }

    }

    public void lerBufferedReader(String nomeArquivo) {
        try {
            // Ler de um arquivo
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
            String linha = reader.readLine();
            System.out.println("Conteúdo do arquivo: " + linha);
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo.");
        }
    }

    /**
     * *******************************************
     * Escrita em Arquivos: Para escrever dados em um arquivo, você pode usar a
     * classe FileOutputStream ou PrintWriter. A classe PrintWriter fornece
     * métodos convenientes para escrever vários tipos de dados formatados em um
     * arquivo.
     *
     ********************************************
     */
    public void escreverFileWriter(String nomeArquivo, String conteudoArquivo) {

        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            PrintWriter escrever = new PrintWriter(arquivo);

            escrever.println(conteudoArquivo);
            escrever.write(conteudoArquivo);
            escrever.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }

    }

    /**
     * ***************
     * Operações de Manipulação de Arquivos: Além da leitura e escrita de
     * arquivos, Java oferece métodos para operações de manipulação de arquivos,
     * como criar, renomear, mover e excluir arquivos. **************
     */
    public void manipular(String nomeArquivo, String novoNome) {
        File arquivo = new File(nomeArquivo);

        // Verificar se o arquivo existe
        System.out.println("Existe? " + arquivo.exists());

        // Renomear o arquivo
        File novoArquivo = new File(novoNome);
        arquivo.renameTo(novoArquivo);

        // Excluir o arquivo
        //novoArquivo.delete();
    }

    public void manipular(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);

        // Excluir o arquivo
        arquivo.delete();
    }

}
