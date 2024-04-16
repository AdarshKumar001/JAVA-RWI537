import java.util.Scanner;

public class negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buttom= sc.nextInt();
        if (buttom == 1) {
            System.out.println("Hello");
        }
        else if (buttom == 2) {
            System.out.println("Namste");
        }
        else if (buttom == 3){
            System.out.println("have you good day");
        }
        else{
            System.out.println("invalid number");
        }
    }
    
}
