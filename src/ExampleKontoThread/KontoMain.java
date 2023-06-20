package ExampleKontoThread;

public class KontoMain {

    public static void main(String[] args) throws InterruptedException {

        Konto k1 = new Konto(100);
        Konto k2 = new Konto(200);

        Runnable w1 = new Worker('A',k1,k2);
        Runnable w2 = new Worker('B',k2,k1);

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();


        t1.join();
        t2.join();
        System.out.println("Konto k1: " + k1.getWert());        //Problem. Es kommt immer etwas anderes heraus. Weil sie unterschiedlich den wert auslesen.
        System.out.println("Konto k1: " + k2.getWert());        //Deshalb ein synchonised beim worker einbauen


    }
}
