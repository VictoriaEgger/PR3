package Package;

import java.io.*;

public class UE10 {
    public static void main(String[] args) throws IOException {
        File f = new File("meineNoten.txt");        //File name
        FileWriter fw = new FileWriter(f);                  //File wird erstellt
        PrintWriter pw = new PrintWriter(fw);                 //Printed was in der datei ist

        InputStreamReader reader = new InputStreamReader(System.in);    // Die eingabe in die konsole
        BufferedReader br = new BufferedReader(reader);                 //buffer liest die eingabe

        String line = br.readLine();                                //Ich gebe einen string ein der vom buffer gelesen wird
        while (line != null){
            if (line.toLowerCase().equals("stop")){
                break;
            }
            pw.println(line);
            fw.flush();                 //File writer schreibt das in die datei, dass ich in die konsole eigebe über den buffer damit es lesbar ist
            System.out.println(line);
            line = br.readLine();
        }

                                      //Flushen damits alles was ich in die konsole eigegebne habe an die datei weitergegeben wird
        fw.close();
    }
}
