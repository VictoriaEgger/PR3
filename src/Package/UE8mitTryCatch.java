package Package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UE8mitTryCatch {
    public static void main(String[] args) {

        InputStreamReader f = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(f);
        String line = null;

        try {
            line = bufferedReader.readLine();

            while (line != null) {
                if (line.toLowerCase().equals("stop")) {
                    break;
                }
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            throw new IOException("Fehler: Das ist eine Test-Exception.");
        } catch (Exception e) {
            System.out.println("Show Error Messsage: " + e.getMessage());
        }

    }
}
