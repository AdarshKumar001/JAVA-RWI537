class A extends Thread{
    public void run(){
        System.out.println("isAlive Method Program..");
    }
}



public class isAliveThread {
    public static void main(String[] args) {
        System.out.println("Adarsh write code here");
         
        A t1A=new A();
        A t2A=new A();
        System.out.println(t1A.isAlive());
        t1A.start();
        System.out.println(t1A.isAlive());

        System.out.println(t2A.isAlive());
        t2A.start();
        System.out.println(t2A.isAlive());
        
    }
    
}
