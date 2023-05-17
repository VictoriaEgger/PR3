package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryInput {
    public static void main(String[] args) throws IOException {

        File f = new File("test.bmp");
        FileInputStream fis = new FileInputStream(f);

        int counter = 0;
        int byteReader;
        while ((byteReader = fis.read()) != -1){ // read liest den binärcode. Wenn -1 datei am ende und es beendet. Read ist binär und liest immer nur eine Zahl/Buchstaben
            System.out.println("Buchstabe: " + (char) byteReader + ", Binär: " + (int) ((char) byteReader));
            counter++;
        }


        System.out.println("Insgesamt wurden " + counter + " Zeichen gezählt.");
    }
}
