package ThreadsAbschlussBSP;

import java.io.*;
import java.util.ArrayList;

public class FileReadWorker extends Arbeiter implements Runnable {

    @Override
    public String toString() {
        return "FileReadWorker{" +
                "lines=" + lines +
                ", path='" + path + '\'' +
                '}';
    }

    private ArrayList<String> lines = new ArrayList<>();

    private String path;

    public FileReadWorker(String name, String path) {
        super(name);
        this.path = path;
    }

    @Override
    protected void work() {
        printStart();

        File f = new File(this.path);
        System.out.println("Path zum file: " + f.getAbsolutePath());

        try {

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                if (schouldRun == false) {
                    break;
                }
                lines.add(line);
                System.out.println("The following Line has been added: " + line);

                Thread.sleep(1000);

            }
            br.close();
            printSTopped();

        }
        catch (FileNotFoundException fnfe){
            System.out.println("File missing...");
            System.out.println(fnfe.getMessage());
        }
        catch (InterruptedException ie){
            System.out.println("zzzzzzzzzzz");
            System.out.println(ie.getMessage());
        }
        catch (IOException io){
            System.out.println("Oh nose! An IOException!!!");
            System.out.println(io.getMessage());
        }
    }

    @Override
    public void run() {
work();

    }
}
