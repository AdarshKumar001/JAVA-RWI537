class AdaThread extends Thread {
    @Override
    public void run() {  
        for (int i = 1; i <= 5; i++) {
            System.out.println("adarsh");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
               System.out.println(e);
            }
        }
    }
}
 class Main {
    public static void main(String[] args) {
        AdaThread adaThread = new AdaThread();
        adaThread.start(); // Start the AdaThread

        for (int j = 1; j <= 5; j++) {
            System.out.println("Adarsh");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
