package THreadExample1;

public class Person implements Runnable{

    private String name;
    private boolean isRunning = true;

    public Person(String name) {
        this.name = name;
        System.out.println("Constructor von Klasse " + name + " erstellt. ID: " + Thread.currentThread().getId());
    }

    public void requestShutdown(){
        this.isRunning = false;
    }

    @Override
    public void run() {
        System.out.println("Klasse Person " + name + " hat run() aufgerufen.");
        for (int i = 0; i <= 10; i++){
            System.out.println(name + " " + Thread.currentThread().getName() + " - " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (isRunning == false){
                break;
            }
        }
    }
}
