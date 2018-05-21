/*package swing.kartykwizowe;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class KwizGra {
    private JTextArea pytanie;
    private JTextArea odpowiedz;
    private ArrayList<KartaKwizowa> listaKart;
    private KartaKwizowa biezacaKarta;
    private int indeksBiezacejKarty;
    private JFrame ramka;
    private JButton przyciskNastepnaKarta;
    private boolean czyPrezentowanaOdpowiedz;
    public static void main (String[] args) {
        KwizGra gra = new KwizGra();
        gra.doDziela();
    }

    public void doDziela() {
// tworzymy graficzny interfejs uytkownika
        ramka = new JFrame("Kwiz");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelGlowny = new JPanel();
        Font czcionkaDuza = new Font("sanserif", Font.BOLD, 24);
        pytanie = new JTextArea(10,20);
        pytanie.setFont(czcionkaDuza);
        pytanie.setLineWrap(true);
        pytanie.setEditable(false);
        JScrollPane przewijanieP = new JScrollPane(pytanie);
        przewijanieP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        przewijanieP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        przyciskNastepnaKarta = new JButton("Pokaz pytanie");
        panelGlowny.add(przewijanieP);
        panelGlowny.add(przyciskNastepnaKarta);
        przyciskNastepnaKarta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(czyPrezentowanaOdpowiedz){
                    pytanie.setText(biezacaKarta.getOdpowiedz());
                    przyciskNastepnaKarta.setText("Nastepna karta");
                    czyPrezentowanaOdpowiedz = false;
                }else {
                    if (indeksBiezacejKarty < listaKart.size()){
                        pokazNastepnaKarte();
                    }else {
                        pytanie.setText("To była ostatnia karta");
                        przyciskNastepnaKarta.setEnabled(false);
                    }
                }
            }
        });
        JMenuBar pasekMenu = new JMenuBar();
        JMenu menuPlik = new JMenu("Plik");
        JMenuItem opcjaOtworz = new JMenuItem("Otwórz zbiór kart");
        opcjaOtworz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser dialogFile = new JFileChooser();
                dialogFile.showOpenDialog(ramka);
                wczytajPlik(dialogFile.getSelectedFile());
            }
        });
        menuPlik.add(opcjaOtworz);
        pasekMenu.add(menuPlik);
        ramka.setJMenuBar(pasekMenu);
        ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
        ramka.setSize(640,500);
        ramka.setVisible(true);
    }
    private void wczytajPlik(File file){
        listaKart = new ArrayList<KartaKwizowa>();
        try {
            BufferedReader czytelnik = new BufferedReader(new FileReader(file));
            String wiersz = null;
            while ((wiersz = czytelnik.readLine()) != null) {
                tworzKarte(wiersz);
            }
            czytelnik.close();
        }catch (Exception ex){
            System.out.println("Nie mozna otworzyc pliku z kartami");
            ex.printStackTrace();
        }
        pokazNastepnaKarte();
    }

    private void tworzKarte(String wierszDanych){
        String[] wyniki = wierszDanych.split("/");
        KartaKwizowa card = new KartaKwizowa(wyniki[0],wyniki[1]);
        listaKart.add(card);
        System.out.println("Utworzono karte");
    }
    private void pokazNastepnaKarte(){
        biezacaKarta = listaKart.get(indeksBiezacejKarty);
        indeksBiezacejKarty++;
        pytanie.setText(biezacaKarta.getPytanie());
        przyciskNastepnaKarta.setText("Pokaz Odpowiedz");
        czyPrezentowanaOdpowiedz = true;
    }
}
*/