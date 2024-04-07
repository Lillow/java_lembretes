package main;

import classes_objetos_heranca_polimorfismo.Interface;
import classes_objetos_heranca_polimorfismo.SubClasse;
import classes_objetos_heranca_polimorfismo.SuperClasse;
import java.util.Scanner;
import manipulacao_de_arquivos.Arquivo;
import programacao_orientada_eventos_Swing.ExemploLayout;
import programacao_orientada_eventos_Swing.JanelaSwing;
import tratamento_de_excecoes.ClausulaFinally;
import tratamento_de_excecoes.Excecao;

/**
 *
 * @author danil
 */
public class MainMetodos {

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

        System.out.println("Escolha o que fazer: \n -Criar aquivo (1) \n -Ler aquivo (2) \n -Renomer aquivo (3) \n -Excluir aquivo (4) \n ");
        var op = ler.nextInt();
        switch (op) {
            case 1:
                criarArquivo();
                break;
            case 2:
                lerArquivo();
                break;
            case 3:
                renomearArquivo();
                break;
            case 4:
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

        arquivo.escrever(nomeArquivo, conteudoArquivo);
    }

    public static void lerArquivo() {
        Scanner ler = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        System.out.println("Nome do arquivo a ser lido: ");
        var nomeArquivo = ler.next();

        arquivo.ler(nomeArquivo);
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

}
