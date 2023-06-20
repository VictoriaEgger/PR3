package UE_3_2;

import java.util.Date;

public class Uhrzeit implements Runnable{

    private String type;

    public Uhrzeit(String type) {
        this.type = type;
    }

    private boolean isRunnable = true;

    private static Object lockClock = new Object();

    public void requestShutdown(){
        this.isRunnable = false;
    }

    public String getType() {
        return type;
    }

    @Override
    public void run() {
        synchronized (lockClock) {
            while (isRunnable == true) {
                Date d = new Date();
                System.out.print(getType());
                System.out.print("[");
                System.out.print(d.toString());
                System.out.print(", CPUS: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(", FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.print("]");
                System.out.println();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
