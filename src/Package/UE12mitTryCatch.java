package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UE12mitTryCatch {

    public static void main(String[] args) {

        File file = new File("test.bmp");
        int counter = 0;
        try {
            FileInputStream fis = new FileInputStream(file);

            int byteReader;
            while ((byteReader = fis.read()) != -1) { // read liest den binärcode. Wenn -1 datei am ende und es beendet. Read ist binär und liest immer nur eine Zahl/Buchstaben
                System.out.println("Buchstabe: " + (char) byteReader + ", Binär: " + (int) ((char) byteReader));
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Error Message: " + e.getMessage());
        }
        System.out.println("Insgesamt wurden " + counter + " Zeichen gezählt.");
    }
}

