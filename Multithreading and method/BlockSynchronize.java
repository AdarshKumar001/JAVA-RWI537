class msg 
{
    public void show(String name){
        synchronized(this){
            for(int i=1;i<=3;i++){
                System.out.println("How are you "+ name);
            }
        }
    }
}
class A extends Thread{
    msg m;
    String name;
    A(msg m,String name){
        this.m=m;
        this.name=name;

    }
    public void run(){
        m.show(name);
    }
}


public class BlockSynchronize {
    public static void main(String[] args) {
         
        msg m=new msg();
        A t1=new A(m,"Adarsh");
        A t2= new A(m,"Ajeet");

        t1.start();
        t2.start();
    }
    
}
