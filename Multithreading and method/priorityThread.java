class A extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}



public class priorityThread {
    public static void main(String[] args) {
        A t1A=new A();
        A t2A=new A();
        A t3A=new A();

        t1A.setName("t1 Thread");
        t2A.setName("t2 Thread");
        t3A.setName("t3 Thread");

        t1A.setPriority(10);
        t2A.setPriority(7);
        t3A.setPriority(2);

        t1A.start();
        t2A.start();
        t3A.start();
    }
    
}
