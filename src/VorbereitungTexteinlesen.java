
import java.io.*;
public class VorbereitungTexteinlesen {

            public static void main(String[] args) throws IOException
            {

                //Pfad ausgeben von datei

                File f = new File("text.txt"); // Kann eine datei oder ein
                System.out.println("Absoluter Pfad zur Datei: " + f.getAbsolutePath()); //INtelliJ weis dass die datei text.txt auf diesem pfad liegt
                //Pfad wäre: C:\Users\s53028\IdeaProjects\PR3

                FileReader fr = new FileReader("text.txt"); //Object
                BufferedReader br = new BufferedReader(fr); // Zwischenspeicher für fr. BufferReader kann Zeile einlesen

//                String zeile1 = br.readLine(); //zeile wird eingelesen
//                System.out.println(zeile1); //Hier wird jede zeile extra eingelesen. Mit einer while Schleife kan ich das ändern das solange eingelesenwird bis ende
//                String zeile2 = br.readLine();
//                System.out.println(zeile2);
//                String zeile3 = br.readLine();
//                System.out.println(zeile3);
//
//                br.close();         // BufferReader schließen weil sonst die datei offen bleibt und benutzt bleibt. Wie am PC wenn steht "die datei ist noch offen"
                                    // Mehrere Programme können nicht auf einer datei bearbeiten


                String zeile = br.readLine();
                while (zeile != null){             //Solange br nicht leer ist  wird eine Zeile eingelesen
                    System.out.println(zeile);
                    zeile = br.readLine();
                }
                br.close();
            }
        }

