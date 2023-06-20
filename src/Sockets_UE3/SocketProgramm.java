package Sockets_UE3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketProgramm {
    public static void main(String[] args) throws IOException {

        //PUTTY: host und port eingeben. Raw und unten never. Dann kann man es direkt vom server sehen

        Socket sock = new Socket("time-a.timefreq.bldrdoc.gov",13);
        InputStreamReader isr = new InputStreamReader(sock.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Reading from Server");

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);


        }
        br.close();
        sock.close();
    }

}
