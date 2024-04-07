/** ***********
 *     FlowLayout: O FlowLayout organiza os componentes em uma linha,
 * de acordo com a ordem em que são adicionados.
 * Quando a linha fica cheia, os componentes continuam em uma nova linha.
 *
 * BorderLayout: O BorderLayout divide o contêiner em cinco regiões: norte, sul, leste, oeste e centro.
 * Os componentes são colocados nessas regiões usando as constantes BorderLayout.NORTH,
 * BorderLayout.SOUTH, etc.
 *
 * GridLayout: O GridLayout organiza os componentes em uma grade de linhas e colunas.
 * Você precisa especificar o número de linhas e colunas quando cria o GridLayout.
 *
 * GridBagLayout: O GridBagLayout é o mais flexível e complexo dos layouts.
 * Ele permite que os componentes sejam organizados em uma grade,
 * mas oferece muito mais controle sobre o tamanho e a posição dos componentes individuais.
 *
 * BoxLayout: O BoxLayout organiza os componentes em uma única linha (horizontal ou vertical),
 * alinhados um após o outro. Ele é útil para criar barras de ferramentas ou
 * painéis com componentes dispostos em uma única direção.
 */
package programacao_orientada_eventos_Swing;

import javax.swing.*;
import java.awt.*;

public class ExemploLayout {

    public void create() {
        JFrame frame = new JFrame("Exemplo de Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Criando componentes
        JButton btnNorte = new JButton("Norte");
        JButton btnSul = new JButton("Sul");
        JButton btnLeste = new JButton("Leste");
        JButton btnOeste = new JButton("Oeste");
        JButton btnCentro = new JButton("Centro");

        // Adicionando componentes ao JFrame com BorderLayout
        frame.add(btnNorte, BorderLayout.NORTH);
        frame.add(btnSul, BorderLayout.SOUTH);
        frame.add(btnLeste, BorderLayout.WEST);
        frame.add(btnOeste, BorderLayout.EAST);
        frame.add(btnCentro, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
