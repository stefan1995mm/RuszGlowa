/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnets.exceptions;

/**
 *
 * @author Stefan
 */
class MojEx extends Exception {}
public class ExTester {
    static void zaryzykuj(String t) throws MojEx{
        System.out.print("i");
        if ("tak".equals(t)) {
           throw new MojEx();
            
        }
    }
    public static void main(String[] args) {
        String test = "tak";
        System.out.print("p");
        try {
            zaryzykuj(test);
            System.out.print("j");
        } catch (MojEx e) {
        }finally{
            System.out.print("a");
            System.out.print("n");
            System.out.println("a");
        }
    }
}
