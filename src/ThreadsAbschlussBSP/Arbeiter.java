package ThreadsAbschlussBSP;

public abstract class Arbeiter {
    protected String name;
    protected boolean schouldRun;

    public Arbeiter(String name) {
        this.name = name;
        this.schouldRun = true;
    }

    protected abstract void work() throws InterruptedException;

    protected void printStart(){
        System.out.println(this.name + " WURDE GESTARTET.");
    }

    protected void printSTopped(){
        System.out.println(this.name + " WURDE GESTOPPED.");
    }

    public void stopWork(){
        this.schouldRun = false;

    }
}
