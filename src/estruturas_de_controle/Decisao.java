package estruturas_de_controle;

public class Decisao {

	Decisao(boolean bool1, boolean bool2) {
		if (bool1 != bool2) {
			System.out.println("Diferentes.");
		} else if (bool1 == bool2) {
			System.out.println("Iguais.");
		}

		else {
			System.out.println("oxi!");
		}
	}

	Decisao(int num) {
		switch (num) {
		case 42:
			System.out.println("GG");
			break;
		case 666:
			System.out.println("Capiroto");
			break;
		// Outros casos...
		default:
			System.out.println(":)");
		}
	}

}
