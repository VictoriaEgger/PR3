package Package;

import java.io.*;

public class UE15 {
    public static void main(String[] args) throws IOException {
        File f = new File("binaryoutputConsol.txt");
        FileOutputStream fos = new FileOutputStream(f);

        char c = (char) System.in.read();   //read liest wieder einen BYTE ein
        while (c != 'x'){
            fos.write(c);
            System.out.println("Zeichen geschrieben " + (int) c);
            c = (char) System.in.read();

        }
        fos.flush();
        fos.close();


    }
}
