package swing.prostaanimacja;
import java.io.*;
import java.util.Scanner;

public class OdczytPliku {
    public static void main(String[] args) {
        try{
            Scanner mojPlik = new Scanner(new File("tekst.txt"));

            String wiersz = null;
            //wiersz = mojPlik.nextLine();
            while ((wiersz = mojPlik.nextLine())!=null){
                System.out.println(wiersz);
            }
            //czytelnik.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
