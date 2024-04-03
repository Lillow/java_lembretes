package main;

import classes_objetos_heranca_polimorfismo.Interface;
import classes_objetos_heranca_polimorfismo.SubClasse;
import classes_objetos_heranca_polimorfismo.SuperClasse;
import tratamento_de_excecoes.Excecao;

public class Main {

    public static void main(String[] args) {
        //        Interface objeto1 = new SubClasse("Objeto1");
        //        System.out.println(objeto1.getNomeClasse());
        //        System.out.println(objeto1.metodoAbstrato());
        //
        //        System.out.println("");
        //
        //        Interface objeto2 = new SuperClasse("Objeto2");
        //        System.out.println(objeto2.getNomeClasse());
        //        System.out.println(objeto2.metodoAbstrato());
//------------------------------------------------------------------------------------------------------------------------------------
        Excecao excecao = new Excecao();

        excecao.dividir(10, 0);

        var num1 = excecao.entrada();
        var num2 = excecao.entrada();
        System.out.println(excecao.dividir(num1, num2));

    }

}
