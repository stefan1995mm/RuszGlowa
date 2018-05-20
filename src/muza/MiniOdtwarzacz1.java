package muza;
import javax.sound.midi.*;

public class MiniOdtwarzacz1 implements ControllerEventListener{
    public static void main(String[] args) {
        MiniOdtwarzacz1 mini = new MiniOdtwarzacz1();
        mini.doRoboty();
    }
    public void doRoboty(){
        try{
            Sequencer sekwenser = MidiSystem.getSequencer();
            sekwenser.open();

            int[] zdarzeniaObslugiwane = {127};
            sekwenser.addControllerEventListener(this,zdarzeniaObslugiwane);

            Sequence sekw = new Sequence(Sequence.PPQ,4);
            Track sciezka = sekw.createTrack();

            for(int i = 5; i<61; i+=4){
                sciezka.add(tworzZdarzenie(144,1,i,100,i));
                sciezka.add(tworzZdarzenie(176,1,127,0,i));
                sciezka.add(tworzZdarzenie(128,1,i,100,i+2));
            }

            sekwenser.setSequence(sekw);
            sekwenser.setTempoInBPM(220);
            sekwenser.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static MidiEvent tworzZdarzenie(int plc,int kanal,int jeden,int dwa,int takt){
        MidiEvent zdarzenie = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(plc,kanal,jeden,dwa);
            zdarzenie = new MidiEvent(a,takt);
        }catch (Exception e){ }
        return zdarzenie;
    }

    @Override
    public void controlChange(ShortMessage zdarzenie) {
        System.out.println("la");
    }
}
