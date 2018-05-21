package magnets.serialize;

import java.io.*;

class GraPrzygodowa implements Serializable {
    public int x = 3;
    transient long y = 4;
    private short z = 5;

    public int getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public short getZ() {
        return z;
    }
}

public class GraPrzygodowaTester{
    public static void main(String[] args) {
        GraPrzygodowa g = new GraPrzygodowa();
        try{
            FileOutputStream fos = new FileOutputStream("gra.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(g);
            oos.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(g.getX()+g.getY()+g.getZ());
        g=null;
        try{
            FileInputStream fis = new FileInputStream("gra.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            g = (GraPrzygodowa) ois.readObject();
            ois.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(g.getX()+g.getY()+g.getZ());
    }
}
