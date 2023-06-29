package ThreadsAbschlussBSP;

import java.util.Date;

public class TimePrintWorker extends Arbeiter implements Runnable{
    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    protected void work() {
        printStart();
        while (schouldRun == true){
            Date d = new Date();
            System.out.println(d.toString());
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie){
                System.out.println("Ups, etwas ist bei de Uhrziet schief gelaufen");
                ie.printStackTrace();
            }
        }
        printSTopped();

    }

    @Override
    public void run() {
        work();

    }
}
