class Y extends Thread{
    public void run(){
        String name= Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
            Thread.yield();
        }
    }
    }
    class Z extends Thread{
        public void run(){
            String name= Thread.currentThread().getName();
            for(int i=1;i<=3;i++){
                System.out.println(name);
            }
        }
        }



public class StopThread {
    public static void main(String[] args) {
        System.out.println("Adarsh write code here");
        Y t1Y=new Y();
        Y t2Y=new Y();
        Y t3Y=new Y();

        t1Y.setName("Adarsh");
        t2Y.setName("Ajeet");
        t3Y.setName("Vivek");

        t1Y.start();
        
        t2Y.start();
        t2Y.stop();

        t3Y.start();
    }
    
}
