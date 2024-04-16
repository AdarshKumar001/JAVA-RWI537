import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:- ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 100) {
            System.out.println(i * n);
            i++;
        }
    }
}
