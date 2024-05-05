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



public class YieldThread {
    public static void main(String[] args) {
        System.out.println("hello");
        Y t1Y=new Y();
        Z t2Z=new Z();


        t1Y.setName("Adarsh");
        t2Z.setName("Vivek");

        t1Y.start();
        t2Z.start();
    }
    
}
