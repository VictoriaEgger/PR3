package Package;

import java.io.*;

public class BufferReaderUEBUNGSystemIn {
    public static void main(String[] args) throws IOException {

        InputStreamReader f2 = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(f2);


        String line = bufferedReader.readLine();

        while (line != null){
            if (line.toLowerCase().equals("stop")){
                break;
            }
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
