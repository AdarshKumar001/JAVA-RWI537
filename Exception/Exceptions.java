import java.util.Scanner;

class YoungerAge extends RuntimeException{
    YoungerAge(String massage){
        super(massage);
    }
}




public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if (age>18) {
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
    
} 


