/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnets.konstruktor;

/**
 *
 * @author Stefan
 */

class Testowa{
    public int dodaj(int a, int b){
        return a+b;
    }
    public float dodaj(float a,float b){
        return a+b;
        
    }
}
public class Konstruktory {
    public static void main(String[] args) {
        Testowa nowa = new Testowa();
        System.out.println(nowa.dodaj(5.0, 10.6));
    
    }
}
