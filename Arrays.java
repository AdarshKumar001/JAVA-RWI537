import java.util.Scanner;

public class Arrays {
    // public static void main(String[] args) {
    //     int [] marks= new int[3];
    //     marks[0]=99;
    //     marks[1]=88;
    //     marks[2]=77;
    //     System.out.println(marks[0]);
    //     System.out.println(marks[1]);
    //     System.out.println(marks[2]);
    // }



    //by the help of loops

    // public static void main(String[] args) {
    //         int [] marks= new int[3];
    //         marks[0]=99; //phy
    //         marks[1]=88; //chem
    //         marks[2]=77; //eng
    //         for(int i=0; i<3; i++){
    //             System.out.println(marks[i]);
    //         }
    //     }


//************************** */


    // public static void main(String[] args) {
    //     int marks[]={99,88,77};
    //     for(int i=0; i<3; i++){
    //         System.out.println(marks[i]);
    //           }
    // }



    //********************* */


    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int size= sc.nextInt();
    //     int number[]=new int[size];
    //     //input
    //     for(int i=0;i<size; i++){
    //         number[i]= sc.nextInt();
    //     }
    //     //output
    //     for(int i=0;i<size; i++){
    //         System.out.println(number[i]);
    //     }
    // }


    //********************* */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int number[]=new int[size];
        //input
        for(int i=0;i<size; i++){
            number[i]= sc.nextInt();
        }
        int x=sc.nextInt();
        //output
        for(int i=0;i<number.length; i++){
            if(number[i]==x){
                System.out.println("x found at index:="+i);
            }
        }
    }
}
 