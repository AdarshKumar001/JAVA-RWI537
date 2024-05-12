// interface parent{
//     default void sayHello(){
//         System.out.println("Hello");
//     }
// }

// class Child implements parent{
//     public void sayHello(){
//         System.out.println("child says hello");
//     }
// }



// public class Java8 { 
//     public static void main(String[] args) {
//         System.out.println("code start ");
//         Child c= new Child();
//         c.sayHello();
//     }
    
// }


//000000000000000000000000000p
 

 
interface A{
    default void sayHello(){
        System.out.println("A says Hello");
    }
}
interface B{
    default void sayHello(){
        System.out.println("B says Hello");
    }
}

public class MyClass implements A,B{  //error aayega
    public static void main(String[] args) {
        MyClass myclass=new MyClass();
        myclass.sayHello();


    }
    @Override
    public void sayHello(){
        B.super.sayHello();
    }
   
}
