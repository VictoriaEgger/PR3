package UE_3_3;

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

    @Override
    public void run() { //Eigendlich sollen sie sich laut angabe nicht abwechseln.

        for (int i = 0; i < 10; i++) {
            synchronized (lock) {       //Nur das blockieren was nötig ist. Die Kritischen Sektion
                counter++;
                System.out.println(name + " zaehlt: " + counter);
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

