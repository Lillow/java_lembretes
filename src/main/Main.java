package main;

//import classes_objetos_heranca_polimorfismo.Interface;
import chamadas_de_API.ApiExemplo;
import classes_objetos_heranca_polimorfismo.Interface;
import classes_objetos_heranca_polimorfismo.SubClasse;
import classes_objetos_heranca_polimorfismo.SuperClasse;
import java.io.IOException;
import java.util.Scanner;
import manipulacao_de_arquivos.Arquivo;
import packages.MinhaClasse;
import programacao_orientada_eventos_Swing.ExemploLayout;
import programacao_orientada_eventos_Swing.JanelaSwing;
import tratamento_de_excecoes.ClausulaFinally;
import tratamento_de_excecoes.Excecao;

public class Main extends MainMetodos {

    public static void main(String[] args) throws IOException {

//        testeHerencaPolimorfismo();
//        excecaoDivisao();
//        clausulaFinally();
//        escolha();
//        janela();
//        exemploLayout();
//        packages();
        apiExemplo();
    }

}

class MainMetodos {

    //classes objetos heranca e polimorfismo
    public static void testeHerencaPolimorfismo() {
        Interface objeto = new SubClasse("SubClasse");
        System.out.println(objeto.getNomeClasse());
        System.out.println(objeto.metodoAbstrato());

        System.out.println("");

        objeto = new SuperClasse("SuperClasse");
        System.out.println(objeto.getNomeClasse());
        System.out.println(objeto.metodoAbstrato());

    }

//------------------------------------------------------------------------------------------------------------------------------------------    
// tratamento de excecões  
    public static void excecaoDivisao() {
        Excecao excecao = new Excecao();

        excecao.dividir(10, 0);

        var num1 = excecao.entrada();
        var num2 = excecao.entrada();
        System.out.println(excecao.dividir(num1, num2));
    }

    public static void clausulaFinally() {
        ClausulaFinally ex = new ClausulaFinally();
        ex.exeArquivo();
    }

//------------------------------------------------------------------------------------------------------------------------------------------    
// manipulação de arquivo 
    public static void escolha() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha o que fazer: \n -Criar aquivo (1) \n -ler ArquivoFile (2) \n -ler ArquivoFileReader (2.1) \n -ler ArquivoBufferedReader(2.2) \n -Renomer aquivo (3) \n -Excluir aquivo (4) \n ");
        var op = ler.next();
        switch (op) {
            case "1":
                criarArquivo();
                break;
            case "2":
                lerArquivoFile();
                break;
            case "2.1":
                lerArquivoFileReader();
                break;
            case "2.2":
                lerArquivoBufferedReader();
                break;
            case "3":
                renomearArquivo();
                break;
            case "4":
                excluirArquivo();
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void criarArquivo() {
        Scanner ler = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        System.out.println("Digite o nome do arquivo: ");
        var nomeArquivo = ler.next();
        System.out.println("Digite o conteúdo do arquivo: ");
        var conteudoArquivo = ler.next();

        arquivo.escreverFileWriter(nomeArquivo, conteudoArquivo);
    }

    public static void lerArquivoFile() {
        Scanner ler = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        System.out.println("Nome do arquivo a ser lido: ");
        var nomeArquivo = ler.next();

        arquivo.lerFile(nomeArquivo);
    }

    public static void lerArquivoFileReader() {
        Scanner ler = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        System.out.println("Nome do arquivo a ser lido: ");
        var nomeArquivo = ler.next();

        arquivo.lerFileReader(nomeArquivo);
    }

    public static void lerArquivoBufferedReader() {
        Scanner ler = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        System.out.println("Nome do arquivo a ser lido: ");
        var nomeArquivo = ler.next();

        arquivo.lerBufferedReader(nomeArquivo);
    }

    public static void renomearArquivo() {
        Scanner ler = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        System.out.println("Nome do arquivos: ");
        var nomeArquivo = ler.next();

        System.out.println("Novo nome do arquivo: ");
        var novoNomeArquivo = ler.next();

        arquivo.manipular(nomeArquivo, novoNomeArquivo);
    }

    public static void excluirArquivo() {
        Scanner ler = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        System.out.println("Nome do arquivos a ser excluirdo: ");
        var nomeArquivo = ler.next();

        arquivo.manipular(nomeArquivo);

    }

    //------------------------------------------------------------------------------------------------------------------------------------------
    //Swing
    public static void janela() {
        JanelaSwing janela = new JanelaSwing();
        janela.dialogBox();
    }

    public static void exemploLayout() {
        ExemploLayout layout = new ExemploLayout();
        layout.create();
    }

    //------------------------------------------------------------------------------------------------------------------------------------------
    //packages
    public static void packages() {
        MinhaClasse obj = new MinhaClasse();
        obj.mostrarMensagem();
    }

    //------------------------------------------------------------------------------------------------------------------------------------------
    //ApiExemplo
    public static void apiExemplo() {
        ApiExemplo api = new ApiExemplo();
        api.getTeste("https://pokeapi.co/api/v2/pokemon/ditto");
    }
}
