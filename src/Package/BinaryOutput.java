package Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryOutput {
    public static void main(String[] args) throws IOException {
        File f = new File("testoutput.txt");
        FileOutputStream fos = new FileOutputStream(f);

        String outputText = "hello File - first output"; // Text den ich ausgeben will
        for (char c : outputText.toCharArray()){ // für jeden einzelnen character vom text in einem char array gespeichert, will ich die einzelen characters ausgeben

            System.out.println("Schreibe char " + (int) c + " in die Datei...");
            fos.write(c);; //text wird dann in der datei gespeichert. Schreibt nicht einzelne characters sondern BYTES!!!
        }
        fos.flush();
        fos.close();
    }
}
