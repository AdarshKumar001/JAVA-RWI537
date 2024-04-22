//string is basically an object that represents
//        sequence of char values. An array of characters works
//        same as Java string. For example:

import java.util.Scanner;

//***********---------------------********************
//// example .

public class string {
    public  static  void main(String[]args){
        String name="Adarsh";
        String fullname="Adarsh kumar";
        String sentences="i am Adarsh";
        System.out.println(name);
        System.out.println(fullname);
        System.out.println(sentences);

    }
}
//***********---------------------********************

//// example .

//public class string {
//    public  static  void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        System.out.println("your name is " + name);
//
//    }
//}
//output print only single word but you want print full sentences then ...


//***********---------------------********************

//example :-

//public class string {
//    public  static  void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println("your name is " + name);
//
//    }
//}
//print full sentences
//output
// your name is i am Adarsh



//***********---------------------********************

                   //  format

//public class string {
//    public  static  void main(String[]args){
//        String s1=new String("Adarsh");
//        String s2=new String("programming");
//        String s3=String.format("%s %s",s1,s2);
//        System.out.println(s3.toString());
//
//
//
//    }
//}


//example  ***********---------------------********************

                         //getByte

//public class string {
//    public  static  void main(String[]args){
//       String str="Adarsh";
//       byte COUNTBYTES[] =str.getBytes();
//       for(int i=0; i< COUNTBYTES.length; i++){
//           System.out.println( COUNTBYTES[i]);
//
//       }
//
//    }
//}
//             


//example  ***********---------------------********************\

                  // uppercase   & lowercase

//public class string {
//    public  static  void main(String[]args){
//
//    String str="vivek";
//        System.out.println(str); //Adarsh
//        System.out.println(str.toUpperCase()); //Adarsh
//        System.out.println(str.toLowerCase()); //Adarsh
//
//    }
//}


//example ***********------***********

             //concatenation
//
//public class string {
//    public  static  void main(String[]args){
//        String firstname = "Adarsh";
//        String lastname = "kumar";
//        String fullname = firstname +" " +  lastname;
//        System.out.println(fullname);
//
//    }
//
//}
//output
//Adarsh kumar



//example 8 : ***********------***********

          // compare_two_string
//
//public class string {
//    public  static  void main(String[]args){
//
//        //1. s1>s2 :+ve value
//        //2. s1<s2 :-ve value
//        //3. s1 == s2 :0
//
//        String s1="Adarsh";
//        String s2="Adarsh kumar";
//        if(s1.compareTo(s2)==0){
//            System.out.println("String are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }
//    }
//}
