/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnets.date;
import static java.lang.System.out;
import java.util.Calendar;
/**
 *
 * @author Stefan
 */
public class PelniaKsiezyca {
        static int DAY_IM = 1000*60*60*24;
    public static void main(String[] argv){
        Calendar c = Calendar.getInstance();
        
        
        c.set(2004, 0, 7, 15, 40);
       long day1 = c.getTimeInMillis();
        for(int x = 0; x < 60; x++){ 
        out.println(String.format("Pelnia wypada %tc", c));
        day1 += (DAY_IM * 29.52);
        c.setTimeInMillis(day1);
  
        }
    }
}
