package Network_1_A;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class ReadFromURL {

    public static void main(String[] args) throws IOException {
        System.out.println("Main starting up...");

        System.out.println("Bitte die gewuenschte URL eingeben: ");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

       // String user_url = userInput.readLine();
        String user_url = "https://ipof.me"; //Zum testen eine fixe URL
        System.out.println("Habe folgende URL erhalten: " + user_url);


        //URL auslesen

        URL myURL = new URL(user_url);
        InputStreamReader isr = new InputStreamReader(myURL.openStream());
        BufferedReader br = new BufferedReader((isr));

        //Schleife die uns so lange etwas von unserem Buffered reader liest bis es null ist
        //Gibt uns den html code aus bis zum schluss
        String one_line;
//        while ((one_line = br.readLine()) != null) {
//            System.out.println(one_line);
//        }


        FileWriter fr = new FileWriter("content.html");
       // System.out.println("Absoluter Pfad: " + f.getAbsolutePath());
        BufferedWriter writer = new BufferedWriter(fr);

       // In einer Zeile:  BufferedWriter bw = new BufferedWriter(new FileWriter("content.html"));

        while ((one_line = br.readLine()) != null){
            System.out.println(one_line);
        writer.write(one_line);
        writer.newLine();

        }

        writer.flush();
        br.close();
        writer.close();

    }
}
