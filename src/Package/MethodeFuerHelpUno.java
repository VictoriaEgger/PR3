package Package;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class MethodeFuerHelpUno {
    public static void main(String[] args) throws IOException, InterruptedException {
helpUNO();
        }

        public static void helpUNO() throws IOException, InterruptedException {
            FileReader fr = new FileReader("unoHelp.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            System.out.print("you called for help");

            for (int i = 0; i <= 3; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
            }
            System.out.println();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        }
    }

