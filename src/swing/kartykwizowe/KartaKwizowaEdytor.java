/*package swing.kartykwizowe;
import java.nio.Buffer;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class KartaKwizowaEdytor {
    private JTextArea pytanie;
    private JTextArea odpowiedz;
    private ArrayList<KartaKwizowa> listaKart;
    private JFrame ramka;

    public static void main(String[] args) {
        KartaKwizowaEdytor edytor = new KartaKwizowaEdytor();
        edytor.doDziela();
    }
    public void doDziela(){
        ramka = new JFrame("Edytor karty kwizowych");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelGlowny = new JPanel();
        Font czcionkaDuza = new Font("sanserif",Font.BOLD,24);
        pytanie = new JTextArea(6,20);
        pytanie.setLineWrap(true);
        pytanie.setWrapStyleWord(true);
        pytanie.setFont(czcionkaDuza);

        JScrollPane przewijaniePyt = new JScrollPane(pytanie);
        przewijaniePyt.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        przewijaniePyt.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        odpowiedz = new JTextArea(6,20);
        odpowiedz.setLineWrap(true);
        odpowiedz.setWrapStyleWord(true);
        odpowiedz.setFont(czcionkaDuza);

        JScrollPane przewijanieOdp = new JScrollPane();
        przewijanieOdp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        przewijanieOdp.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton przyciskNastepna = new JButton("Nastepna karta");

        listaKart = new ArrayList<KartaKwizowa>();
        JLabel etykietaPyt = new JLabel("Pytanie:");
        JLabel etykietaOdp = new JLabel("Odpowiedz:");

        panelGlowny.add(etykietaPyt);
        panelGlowny.add(przewijaniePyt);
        panelGlowny.add(etykietaOdp);
        panelGlowny.add(przewijanieOdp);
        panelGlowny.add(przyciskNastepna);
        przyciskNastepna.addActionListener(e -> {
            KartaKwizowa karta = new KartaKwizowa(pytanie.getText(),odpowiedz.getText());
            listaKart.add(karta);
            czyscKarte();
        });
        JMenuBar menu = new JMenuBar();
        JMenu menuPlik = new JMenu("Plik");
        JMenuItem opcjaNowa = new JMenu("Nowy");
        JMenuItem opcjaZapisz = new JMenuItem("Zapisz");
        opcjaNowa.addActionListener(e -> {
            listaKart.clear();
            czyscKarte();
        });
        opcjaZapisz.addActionListener(e -> {
            KartaKwizowa karta = new KartaKwizowa(pytanie.getText(),odpowiedz.getText());
            listaKart.add(karta);

            JFileChooser plikDanych = new JFileChooser();
            plikDanych.showSaveDialog(ramka);
            zapiszPlik(plikDanych.getSelectedFile());
        });

        menuPlik.add(opcjaNowa);
        menuPlik.add(opcjaZapisz);
        menu.add(menuPlik);
        ramka.setJMenuBar(menu);
        ramka.getContentPane().add(BorderLayout.CENTER,panelGlowny);
        ramka.setSize(500,600);
        ramka.setVisible(true);
    }
    private void czyscKarte(){
        pytanie.setText("");
        odpowiedz.setText("");
        pytanie.requestFocus();
    }

    private void zapiszPlik(File plik){
        try {
            BufferedWriter pisarz = new BufferedWriter(new FileWriter(plik));
            for (KartaKwizowa karta: listaKart){
                pisarz.write(karta.getPytanie() + "/");
                pisarz.write(karta.getOdpowiedz()+ "\n");
            }
            pisarz.close();
        } catch (IOException ex){
            System.out.println("Nie mozna zapisac pliku kart");
            ex.printStackTrace();
        }
    }
}
*/
