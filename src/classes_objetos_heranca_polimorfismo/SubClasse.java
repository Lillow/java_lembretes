package classes_objetos_heranca_polimorfismo;

public class SubClasse extends SuperClasse {

    public SubClasse(String nomeClasse) {
        super(nomeClasse);
    }

    @Override
    public String metodoAbstrato() {
        return "Método Abstrato Sub Classe Polimorfico";
    }

}
