class A extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println("T1 thread running");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("T1 thread terminated");
        }
    }
}


public class interruptThread {
    public static void main(String[] args) {
        A t1A=new A();
        t1A.start();
        t1A.interrupt();
    }
    
}
