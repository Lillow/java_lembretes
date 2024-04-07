/** *********
 * Introdução ao Swing: Swing é uma biblioteca gráfica para Java que permite criar interfaces
 * gráficas de usuário. Ele fornece uma ampla gama de componentes, como botões,
 * caixas de texto, rótulos, listas, etc., para criar interfaces interativas.
 *
 *   Componentes Swing: Alguns dos componentes Swing mais comuns incluem
 * JFrame, JPanel, JButton, JTextField, JLabel, JComboBox, JCheckBox, JRadioButton, etc.
 *
 * Modelo de Eventos em Swing: Em Swing, os eventos são gerados quando o usuário interage
 * com os componentes da interface gráfica. Esses eventos são tratados por ouvintes de eventos,
 * que são objetos que implementam interfaces específicas de evento, como ActionListener,
 * MouseListener, KeyListener, etc.
 *
 * * Tratamento de Eventos em Swing: Para lidar com eventos em Swing,
 * você precisa registrar ouvintes de eventos nos componentes relevantes
 * e implementar métodos de tratamento de eventos para responder às ações do usuário.
 */
package programacao_orientada_eventos_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author danil
 */
public class JanelaSwing {

    public void dialogBox() {
        JFrame frame = new JFrame("Exemplo Swing");
        JButton button = new JButton("Clique-me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Você clicou no botão!");
            }
        });

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
