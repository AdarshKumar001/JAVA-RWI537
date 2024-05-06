class Join extends Thread{
    public void run(){
        String name= Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
        }
    }
}


public class joinThread {
    public static void main(String[] args) {
    Join t1Join=new Join();
    Join t2Join=new Join();
    Join t3Join=new Join();

    t1Join.setName("Thread 1");
    t2Join.setName("Thread 2");
    t3Join.setName("Thread 3");
     t2Join.start();
     try{
        t2Join.join();
     }
     catch(InterruptedException e){
        System.out.println(e);
     }
     t1Join.start();
     t3Join.start();

    }
    
}
