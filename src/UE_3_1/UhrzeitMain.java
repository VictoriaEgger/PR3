package UE_3_1;

import THreadExample1.ConsoleHelper;

import java.util.Date;

public class UhrzeitMain {
    public static void main(String[] args) {
Uhrzeit u1 = new Uhrzeit("Digitale Uhr");
 Thread t1 = new Thread(u1);
 t1.start();
        System.out.println("Thread " + t1.getName() + " wird gestartet...");

     if (ConsoleHelper.readLine() != null){
         u1.requestShutdown();
         System.out.println(t1.getName() +" " + t1.getState());
     }

    }
}
