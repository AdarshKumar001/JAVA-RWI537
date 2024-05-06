// public class TestThrow {
//     public static void validate(int age) {  
//         if(age<18) {  
             
//             throw new ArithmeticException("Person is not eligible to vote");    
//         }  
//         else {  
//             System.out.println("Person is eligible to vote!!");  
//         }  
//     }  
//     //main method  
//     public static void main(String args[]){  
        
//         validate(15);  
//         System.out.println("rest of the code...");    
//   }  
// }



//0000000000000000000000000000000000000000000000
//new code here


class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor  
        super(str);  
    }  
}  

public class TestThrow  
{  
    public static void main(String args[])  
    {  
        try  
        {  
    
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude)  
        {  
            System.out.println("Caught the exception");  
             
            System.out.println(ude.getMessage());  
        }  
    }  
}   
