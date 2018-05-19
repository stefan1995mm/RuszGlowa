/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muza;
import javax.sound.midi.*;
/**
 *
 * @author Stefan
 */

public class MiniMiniMuzaAplk {
  public void graj(){
      try {
          Sequencer sekwenser = MidiSystem.getSequencer();
          sekwenser.open();
          Sequence sekw = new Sequence(Sequence.PPQ, 4);
          Track sciezka = sekw.createTrack();
          ShortMessage a = new ShortMessage();
          ShortMessage pierwszy = new ShortMessage();
          pierwszy.setMessage(192,1,55,0);

          MidiEvent zmiana = new MidiEvent(pierwszy, 1);
          sciezka.add(zmiana);          
          a.setMessage(144,1,44,100);
          MidiEvent nutaP = new MidiEvent(a, 3);
          sciezka.add(nutaP);
          
          ShortMessage b = new ShortMessage();
          b.setMessage(128,1,44,100);
          MidiEvent nutaK = new MidiEvent(b, 16);
          sciezka.add(nutaK);
          sekwenser.setSequence(sekw);
          sekwenser.start();
      } catch (Exception ex) {
          ex.printStackTrace();
      }
      
}  
  

public static void main(String[] args) {
   MiniMiniMuzaAplk mini = new MiniMiniMuzaAplk();
   mini.graj();
  
}
}
