package Package;

import java.io.*;

public class TryCatchUebung {
    public static void main(String[] args) {

        File file = new File("test-output.txt");
// FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        System.out.println("File path: " + file.getAbsolutePath());
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
// Für Optimierung der Performance -> BufferedInputStream
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

// read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
// While-Schleife liest somit Zeichen um Zeichen aus.
            int byteRead;
            int counter = 0;
            while ((byteRead = bufferedInputStream.read()) != -1) {
// char[] ch = Character.toChars(byteRead);
// System.out.println(ch);
// Byte wird in char umgewandelt und ausgegeben.
                System.out.println("Zeichen " + counter + " : ");
                System.out.println((int) ((char) byteRead));
                System.out.println((char) byteRead);
                counter++;
            }

// close() gibt die Datei wieder frei.


        } catch (FileNotFoundException fnfe) {
            System.out.println("Error Message FileNotFoundException: " + fnfe.getMessage());
        } catch (IOException e) {
            System.out.println("Error Message IOException: " + e.getMessage());
        }
    }
}

