/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnets.interfaces;

/**
 *
 * @author Stefan
 */

interface Nos{
    public int iMetoda();
}

abstract class Picasso implements Nos{

    @Override
    public int iMetoda() {
        return 7;
    }
}

class Klaun extends Picasso{}

class Akty extends Picasso{

    @Override
    public int iMetoda() {
        return 5;
    }
}
public class Of76 extends Klaun{
    public static void main(String[] args) {
        Nos[] i = new Nos[3];
        i[0] = new Akty();
        i[1] = new Klaun();
        i[2] = new Of76();
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMetoda()+ " " + i[x].getClass());
        }
    }
    
}
