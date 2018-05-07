package gra;

import java.util.ArrayList;

public class PortalGraMax {
    private PomocnikGry pomocnik = new PomocnikGry();
    private ArrayList<Portal> listaPortali = new ArrayList<Portal>();
    private int iloscRuchow = 0;

    private void przygotujGre(){
        Portal pierwszy = new Portal();
        pierwszy.setNazwa("onet.pl");
        Portal drugi = new Portal();
        drugi.setNazwa("wp.com");
        Portal trzeci = new Portal();
        trzeci.setNazwa("Go2.com");
        listaPortali.add(pierwszy);
        listaPortali.add(drugi);
        listaPortali.add(trzeci);

        System.out.println("Twoim celem jest zatopienie trzech portali.");
        System.out.println("Onet,wp,go2");
        System.out.println("Postaraj się je zatopić w jak najmniejszej liczbie");

        for (Portal rozmieszczanyPortal : listaPortali){
            ArrayList<String> nowePolozenie = pomocnik.rozmiescPortal(3);
            rozmieszczanyPortal.setPolaPolozenia(nowePolozenie);
        }
    }
    private void rozpocznijGre(){
        while(!listaPortali.isEmpty()){
            String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj Pole:");
            sprawdzRuchGracza(ruchGracza);
        }
        zakonczGre();
    }

    private void sprawdzRuchGracza(String ruch) {
        iloscRuchow++;
        String wynik = "pudlo";

        for (Portal portalDoSprawdzenia : listaPortali){
            wynik = portalDoSprawdzenia.sprawdz(ruch);
            if (wynik.equals("trafiony")){
                break;
            }
            if(wynik.equals("zatopiony")){
                listaPortali.remove(portalDoSprawdzenia);
                break;
            }
        }
        System.out.println(wynik);
    }
    private void zakonczGre(){
        System.out.println("Wszystkie portale zostały zatopione");
    }

    public static void main(String[] args){
        PortalGraMax gra = new PortalGraMax();
        gra.przygotujGre();
        gra.rozpocznijGre();
    }
}
