package Package;

import java.io.*;

public class BufferReaderUEBUNG {
    public static void main(String[] args) throws IOException {

        File f = new File("werbung.txt");
        System.out.println("Absoluter Pfad: " + f.getAbsolutePath());
        BufferedReader bufferedReader = new BufferedReader(new FileReader("werbung.txt"));


        String line = bufferedReader.readLine();
        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();

        }
        bufferedReader.close();
    }
}
