package Package;

import java.io.*;

public class OutputUebung {
    public static void main(String[] args) throws IOException {

        File f = new File("textdatei erstellen.txt");
        FileWriter fw = new FileWriter(f,true); // wenn ich beim file writer true für append hinschriebe, wird die etwas angehängt auch wenn ich den text
        //von existierenden text zb Bonjour ändere. Es hat sich was gändert und alles bereits geschriebene wird erneut dranghängt.
        PrintWriter printWriter = new PrintWriter(fw);

        printWriter.println("Servus");
        printWriter.println("Good Morning");
        printWriter.println("You shall not pass");
        printWriter.println("yasas");

        printWriter.flush();
        printWriter.close();


    }
}
