package swing.prostaanimacja;
import javax.swing.*;
import java.awt.*;
public class ProstaAnimacja {
    int x = 70;
    int y = 70;

    public static void main(String[] args){
        ProstaAnimacja gui = new ProstaAnimacja();
        gui.doRoboty();
    }

    public void doRoboty(){
        JFrame ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MojPanelRysunkowy panel = new MojPanelRysunkowy();

        ramka.getContentPane().add(panel);
        ramka.setSize(300,300);
        ramka.setVisible(true);

        for(int i = 0; i<130;i++){
            x++;
            y++;
            //ramka.repaint();
            panel.repaint();
            try{
                Thread.sleep(50);
            } catch (Exception ex) {}
        }
    }

    class MojPanelRysunkowy extends JPanel {
        public void paintComponent(Graphics g){
            g.setColor(Color.WHITE);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }
}

