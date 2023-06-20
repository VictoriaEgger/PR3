package MultiThreads;

public class THreadMain {
        public static void main(String[] args) throws InterruptedException {
            int n = 8; // Number of threads
            for (int i = 0; i < n; i++) {
                Thread object = new Thread(new MultithreadingDemo()); //Thread ID ist bei 16 weil nebenbei andere sachen auch scon laufen
                object.start();
                Thread.sleep(700); //damit immer ein thread nach dem anderen abläuft. ist aber nicht schön. Besser
                // wenn man einen thread
            }
        }
}
