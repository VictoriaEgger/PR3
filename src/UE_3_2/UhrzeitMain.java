package UE_3_2;

import THreadExample1.ConsoleHelper;

public class UhrzeitMain {
    public static void main(String[] args) {
Uhrzeit u1 = new Uhrzeit("Digitale Uhr");
Uhrzeit u2 = new Uhrzeit("Analoge Uhr");
 Thread t1 = new Thread(u1);
 Thread t2 = new Thread(u2);
 System.out.println("Thread " + t1.getName() + " wird gestartet...");
 System.out.println("Thread " + t2.getName() + " wird gestartet...");

        t1.start();
        t2.start();

     if (ConsoleHelper.readLine() != null){
         u1.requestShutdown();
         System.out.println(t1.getName() +" " + t1.getState());
     }

    }
}
