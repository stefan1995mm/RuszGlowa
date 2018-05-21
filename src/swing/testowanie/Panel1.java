package swing.testowanie;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import  java.awt.*;
import java.awt.event.*;

public class Panel1{
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.doRoboty();
    }
    public void doRoboty() {
        JFrame ramka = new JFrame();
        JCheckBox przyciskcheck = new JCheckBox();
        przyciskcheck.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (przyciskcheck.isSelected())
                {
                    System.out.println("włączone");

                }else{
                    System.out.println("Wyłączone");

                }
            }
        });
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JTextField tekst = new JTextField(20);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS ));
        panel.setBackground(Color.darkGray);
        tekst.addActionListener((ActionEvent e) -> {
            System.out.println(tekst.getText());
            tekst.setText("");
        });
        tekst.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("test");
            }
        });
        JButton przycisk = new JButton("To szok");
        JButton przycisk2 = new JButton("Trach!");
        JButton przycisk3 = new JButton("och?!");
        panel.add(przycisk);
        panel.add(przycisk2);
        panel.add(przycisk3);
        panel2.add(tekst);
        panel2.add(przyciskcheck);
        ramka.getContentPane().add(BorderLayout.EAST,panel);
        ramka.getContentPane().add(BorderLayout.CENTER,panel2);
        ramka.setSize(500,500);
        ramka.setVisible(true);

    }
}
