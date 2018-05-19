package swing;

import javax.swing.*;

/**
 *
 * @author Stefan
 */
public class ProstyGUI1 {
    public static void main(String[] args) {
        JFrame ramka = new JFrame();
        JButton przycisk = new JButton("Kliknij mnie");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(przycisk);
        ramka.setSize(300,300);
        ramka.setVisible(true);
    }
}