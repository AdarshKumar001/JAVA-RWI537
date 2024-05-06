class Bus implements Runnable{
int available=2,passenger;
Bus(int passenger){
    this.passenger=passenger;
}
public synchronized void run(){   //t1 or t2 or t3
   
    String name=Thread.currentThread().getName();
    if(available>=passenger){  //0>=1
        System.out.println(name+" Reversed seat..!");
        available=available-passenger;  //1+1=0
    }
    else{
        System.out.println(name+" sorry seat not available..!");
    }
}
}



public class synchronizedThread {
    public static void main(String[] args) {
       Bus r= new Bus(1);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);

        t1.setName("Adarsh");
        t2.setName("vivek");
        t3.setName("Ajeet");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
