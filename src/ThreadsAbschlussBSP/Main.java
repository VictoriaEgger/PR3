package ThreadsAbschlussBSP;

import UE_3_3.Worker;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        TimePrintWorker tpw = new TimePrintWorker("Ferguson");
FileReadWorker frw = new FileReadWorker("Findus","findusfile.txt");

        Thread t1 = new Thread(tpw);
        Thread t2 = new Thread(frw);
       t1.start();
        t2.start();

       //t1.join();
        t2.join();
        tpw.stopWork();
        System.out.println(frw.toString());

    }
}
