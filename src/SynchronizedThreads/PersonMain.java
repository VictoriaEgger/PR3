package SynchronizedThreads;

import THreadExample1.ConsoleHelper;

public class PersonMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread ID: " + Thread.currentThread().getId() + ", Name: " + Thread.currentThread().getName());

        Person p1 = new Person("Reiner");
        Person p2 = new Person("Wilde Hilde"); // gleichzeitig runnable und Person also -> Runnable p2 = new...

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();                 //start aufrufen sonst geht run nicht im object
        t2.start();
        System.out.println("main(): beide Threads gestartet");
        System.out.println("Drücken sie einen taste um die Threads zu stoppen");
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.join();      //Main thread wartet bis beide threads fertig sind. Erst dann führt er das sout aus
        t2.join();
        System.out.println("main(): beide threads sind fertig");

        if (ConsoleHelper.readLine() != null){
            p1.requestShutdown();
                   //kann nur von einer person ausgeführt werden. Also mit runnable würde es nicht gehenj

            System.out.println(t1.getName() +" " + t1.getState());
            System.out.println(t2.getName() +" " +t2.getState());
        }

        if (ConsoleHelper.readLine() != null){
            p2.requestShutdown();       //kann nur von einer person ausgeführt werden. Also mit runnable würde es nicht gehenj

            System.out.println(t1.getName() +" " + t1.getState());
            System.out.println(t2.getName() +" " +t2.getState());
        }



    }
}
