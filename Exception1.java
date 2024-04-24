public class Exception1 {
    // public static void main(String[] args) {
    //     int a=10;
    //     int b=0;
    //     int c;
    //     // ArithmeticException
    //     try{
    //         c=a/b;
    //         System.out.println(c);
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println(e);
    //     }
    //     System.out.println("code id ended");
    // }

    //000000000000000000000000000000
    // NullPointerException
  
    // public static void main(String[] args) {
    //     String str= null;
    //     try{
    //         System.out.println(str.toUpperCase());
    //     }
    //     catch(NullPointerException e){
    //         System.out.println("null can't be casted");
    //     }
    // }



    //000000000000000000000000000

    public static void main(String[] args) {
        String str="Adarsh";
        try{
            int a = Integer.parseInt(str);
            System.out.println(a);
            System.out.println("String NumberFormatException");
        }
        catch(NumberFormatException e){
            System.out.println("String "+str+" can't be Converted to interger");
        }
        System.out.println("Main method ended");
       
    }
}
