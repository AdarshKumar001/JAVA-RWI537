class Suspend extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
        }
    }
}


public class suspendThread { 
    public static void main(String[] args) throws InterruptedException{
        Suspend t1Suspend=new Suspend();
        Suspend t2Suspend=new Suspend();
        Suspend t3Suspend=new Suspend();

        t1Suspend.setName("Adarsh");
        t2Suspend.setName("Raj");
        t3Suspend.setName("Gill");

        t1Suspend.start();

        t2Suspend.start();
        t2Suspend.suspend();

        t3Suspend.start();

        t2Suspend.resume();
    }
}