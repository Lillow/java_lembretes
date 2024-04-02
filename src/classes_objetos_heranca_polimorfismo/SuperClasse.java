package classes_objetos_heranca_polimorfismo;

public class SuperClasse implements Interface {

    private String nomeClasse;

    public SuperClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;

    }

    @Override
    public String getNomeClasse() {
        return nomeClasse;
    }

    @Override
    public String metodoAbstrato() {
        return "Método Abstrato Super Classe";
    }

}
