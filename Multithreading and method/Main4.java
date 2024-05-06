class Main5 implements Runnable {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(n);
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Create instances of Main5
        Main5 main5 = new Main5();
        Main5 main6 = new Main5();
        Main5 main7 = new Main5();

        // Create threads with Main5 instances
        Thread thread1 = new Thread(main5);
        Thread thread2 = new Thread(main6);
        Thread thread3 = new Thread(main7);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
