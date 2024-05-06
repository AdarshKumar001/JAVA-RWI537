class Main2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My child Thread");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Main2 main2 = new Main2(); // Create an instance of Main2
        Thread main2Thread = new Thread(main2); // Create a new thread with Main2 instance

        main2Thread.start(); // Start the child thread (Main2's run method will execute concurrently)

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}