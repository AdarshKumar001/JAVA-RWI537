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

    // public static void main(String[] args) {
    //     String str="Adarsh";
    //     try{
    //         int a = Integer.parseInt(str);
    //         System.out.println(a);
    //         System.out.println("String NumberFormatException");
    //     }
    //     catch(NumberFormatException e){
    //         System.out.println("String "+str+" can't be Converted to interger");
    //     }
    //     System.out.println("Main method ended");
       
    // }


    //0000000000000000000000000000000

    // public static void main(String[] args) {
    //     try{
    //         System.out.println("hello Adarsh");
    //         int a=10,b=2,c;
    //         c=a/b;
    //         System.out.println("code is successful run");
    //     }
    //     catch(Exception e){
    //         System.out.println("my name adarsh"+e);
    //     }
    //     finally{
    //         System.out.println("this massage is finally block");
    //     }
    //     System.out.println("main method ended");
    // }


    //000000000000000000000000000000000


    // public static void main(String[] args) {
    //     try{
    //         int a=10,b=0,c;
    //         c=a/b;
    //         System.out.println(c);
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("can't devide by Zero");
    //     }
    //     try{
    //         int a[]={10,12,14,18,20};
    //         System.out.println(a[4]);
    //     }
    //     catch(ArrayIndexOutOfBoundsException n){
    //         System.out.println("beyond the array limit");
    //     }
    // }


    //0000000000000000000000000000000

   
    public static void main(String[] args) {
        try{
            int a=10,b=2,c;
            c=a/b;
            System.out.println(b);

            int A[]={10,20,30,50,80};
             System.out.println(A[3]);
             
             String str="adarsh";
            System.out.println(toUpperCase(str));
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException n){
            System.out.println(n);
        }
        catch(Exception m){
            System.out.println(m);
        }
    }

    private static char[] toUpperCase(String str) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toUpperCase'");
    }

    

    
}
