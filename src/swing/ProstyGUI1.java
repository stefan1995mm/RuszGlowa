package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Stefan
 */
public class ProstyGUI1{
    JFrame ramka;
    JLabel etykieta;
    public static void main(String[] args) {
        ProstyGUI1 apGUI = new ProstyGUI1();
        apGUI.doDziela();
    }
    public void doDziela(){
        ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton przycisk = new JButton("Kliknij mnie");
        przycisk.addActionListener(new KolorListener());
        etykieta = new JLabel("Etykietka");
        MojPanelGraficzny panel = new MojPanelGraficzny();
        JButton przycisk2 = new JButton("Drugi przycisk");
        przycisk2.addActionListener(new EtykietaListener());
        ramka.getContentPane().add(BorderLayout.CENTER,panel);
        ramka.getContentPane().add(BorderLayout.WEST,etykieta);
        ramka.getContentPane().add(BorderLayout.EAST,przycisk2);
        ramka.getContentPane().add(BorderLayout.SOUTH,przycisk);

        ramka.setSize(500,300);
        ramka.setVisible(true);
    }
    class EtykietaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent zdarzenie){
            etykieta.setText("Auuuu");
        }
    }
    class KolorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent zdarzenie){
            ramka.repaint();
        }
    }

}
class MojPanelGraficzny extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int czerwony = (int) (Math.random()*256);
        int zielony = (int) (Math.random()*256);
        int niebieski = (int) (Math.random()*256);
        Color kolorpoczatkowy = new Color(czerwony,zielony,niebieski);
        czerwony = (int) (Math.random()*256);
        zielony = (int) (Math.random()*256);
        niebieski = (int) (Math.random()*256);
        Color kolorkoncowy = new Color(czerwony,zielony,niebieski);
        GradientPaint gradient = new GradientPaint(70,70,kolorpoczatkowy,150,150,kolorkoncowy);
        g2d.setPaint(gradient);
        g.fillOval(70,70,100,100);
    }
}