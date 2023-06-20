package THreads;

public class SimpleThread {
    public static void main(String[] args) {
        System.out.println("This code is running in a thread. MAIN THREAD");
        System.out.println("I am inside the thread: " + Thread.currentThread().getName());
    }
}
