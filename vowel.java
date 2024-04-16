import java.util.Scanner;
public class vowel {
    public static void main(String[] args){
              char ch;
              Scanner r=new Scanner(System.in);
               System.out.println("Enter a string");
              ch= r.next().charAt(0);
               if(ch =='a' ||ch =='e' || ch =='i' || ch =='o' ||ch =='u'|| ch =='A' ||ch =='E' || ch =='I' || ch =='O' ||ch =='U'){
                   System.out.println("vowel");
               }
               else {
                   System.out.println("const");
               }
           }
}
