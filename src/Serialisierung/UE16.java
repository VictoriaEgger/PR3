package Serialisierung;

import java.io.*;

public class UE16 {

    public static class myClass implements Serializable{    //Um eigenes object rauszuschrieben
        int a = 3;
        String h = "Hallo";
        byte[] c = {'e', 'x', 'a', 'g'};
        double d = 3.5;

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String text1 = "Hallo Welt";
        String text2 = "Tschau mit au";
        int zahl = 2345;
        File f = new File("object.dat");
        System.out.println(f.getAbsolutePath());
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        oos.writeObject(text1); //String
        oos.writeObject(text2); //String
        oos.writeObject((int) zahl); //int

        //Genau so wie ich es die datei reinschreibe, so muss ich auch die reiehenfolge einhalten
        //Wenn zb am anfang ein string ist, kann ich keinen int auslesen
        System.out.println((String) ois.readObject() + ", " + ois.readObject() + ", " + (int) ois.readObject());

        myClass myObject = new myClass();
        //Object in die Datei schrieben
        oos.writeObject( myObject);


        oos.close();
    }
}
