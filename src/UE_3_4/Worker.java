package UE_3_4;

public class Worker implements Runnable {

    private String name;
    private static int counter;

    private static Object lock = new Object();

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    private boolean transfer = true;

    @Override
    public void run() {
        synchronized (lock) {       //Hier zählt ein thread. Der zweite wartet bis der andere fertig ist.
            for (int i = 0; i < 10; i++) {
                counter++;
                System.out.println(name + " zaehlt: " + counter);
                lock.notify();      // Jetzt sagt der einen thread das er einmal hochgezählt hat
                try {
                    lock.wait();    //Der jetzige thread geht schlafen und wartet bis der nächste ihn wieder weckt mit notify
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lock.notifyAll();   //Zum schluss alle threads benachrichtigen, dass sie fertig sind. Sonst wartet das programm weiter.
            }
        }

    }

}


