package estruturas_de_controle;

public class Repeticao {

    public void for_(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Número: " + i);
        }
    }

    public void forEach(int[] nums) {
        for (int i : nums) {
            System.out.println("Número: " + i);
        }
    }

    public void while_(int num) {
        while (num > 0) {
            System.out.println("Número: " + num);
            num--;
        }
    }

    public void doWhile_(int num) {
        do {
            System.out.println("Número: " + num);
            num--;
        } while (num > 0);

    }

}
