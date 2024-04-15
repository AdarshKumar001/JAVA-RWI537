import java.util.Scanner;

public class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buttom=sc.nextInt();
        switch (buttom) {
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("bonjur");
            break;
            default:System.out.println("invelid number");
        }
    }
}
