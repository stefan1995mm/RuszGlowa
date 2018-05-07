package gra;

import java.util.ArrayList;

public class Portal {
    private ArrayList<String> polaPolozenia;
    private String nazwa;

    public void setPolaPolozenia(ArrayList<String> polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String sprawdz(String ruch){
        String wynik = "pudlo";
        int indeks = polaPolozenia.indexOf(ruch);
        if(indeks>=0){
            polaPolozenia.remove(indeks);
            if(polaPolozenia.isEmpty()){
                System.out.println("Zatopiles " + nazwa);
                return "zatopiony";
            } else{
                return "trafiony";
            }
        }
        return wynik;
    }
}
