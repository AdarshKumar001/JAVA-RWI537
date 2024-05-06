class Bank implements Runnable {
    private static int bal = 5000; 
    private int withdrawAmount;

    public Bank(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public synchronized void withdraw(String threadName) {
        if (withdrawAmount <= bal) {
            System.out.println(threadName + " is withdrawing " + withdrawAmount);
            bal -= withdrawAmount;
           
        } else {
            System.out.println(threadName + " : Insufficient Balance");
        }
    }

    
    public void run() {
        String name = Thread.currentThread().getName();
        withdraw(name);
    }
}

public class staticSynchronized {
    public static void main(String[] args) {
        Bank obj1 = new Bank(3000);
        Bank obj2 = new Bank(2000);

        Thread t1 = new Thread(obj1, "Adarsh");
        Thread t2 = new Thread(obj1, "Vivek");
        Thread t3 = new Thread(obj2, "Ajeet");
        Thread t4 = new Thread(obj2, "Divyansu");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
