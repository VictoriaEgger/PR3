package UE_3_1;

import java.time.LocalDateTime;
import java.util.Date;

public class Uhrzeit implements Runnable{

    private String type;

    public Uhrzeit(String type) {
        this.type = type;
    }

    private boolean isRunnable = true;

    public void requestShutdown(){
        this.isRunnable = false;
    }

    @Override
    public void run() {
        while (isRunnable == true){
            Date d = new Date();
            System.out.println("Aktuelle Uhrzeit: " + d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
