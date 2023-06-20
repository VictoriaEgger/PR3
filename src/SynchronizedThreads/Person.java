package SynchronizedThreads;

public class Person implements Runnable {

    private String name;
    private boolean isRunning = true;

    private static Object lock = new Object();

    public Person(String name) {
        this.name = name;
        System.out.println("Constructor von Klasse " + name + " erstellt. ID: " + Thread.currentThread().getId());
    }

    public void requestShutdown() {
        this.isRunning = false;
    }

    @Override
    public void run() {
        System.out.println("Klasse Person " + name + " hat run() aufgerufen.");
        synchronized (lock) {       //das zählen kann jetzt nur von einem thread machen bis er fertig ist. Dann geht es zum nächsten
            for (int i = 0; i <= 100; i++) {
                System.out.println(name + " " + Thread.currentThread().getName() + " - " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (isRunning == false) {
                    break;
                }
            }
        }
    }
}
