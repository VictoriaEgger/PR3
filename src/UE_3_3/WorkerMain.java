package UE_3_3;

public class WorkerMain {
    public static void main(String[] args) throws InterruptedException {

        Worker w1 = new Worker("Obelix");
        Worker w2 = new Worker("Asterix");

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        /* 20 Threads starten die zählen sollen:
        for(int i = 0; i < 20; i++){
        Thread threadTMP = new Thread();
        threadTMP.start();
        }

        Dann startet
         */

    }
}
