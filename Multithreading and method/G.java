class Geeks extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("GeeksforGeeks");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread Interrupted", e); // Corrected: Throw RuntimeException with cause
        }
    }
}

public class G {
    public static void main(String[] args) {
        System.out.println("hello");
        Geeks t1Geeks = new Geeks();
        t1Geeks.start();
        try {
            t1Geeks.interrupt();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}
