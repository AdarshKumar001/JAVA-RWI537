// import java.util.List;
 import java.util.function.Predicate;
// import java.util.Arrays;

 public class Predicates {
//     public static void main(String[] args) {
//         Predicate<Integer>isEven=x->x%2==0;
//         List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
//         for(Integer i:numbers){
//             if(isEven.test(i)){
//                 System.out.println(i);
//             }
//         }
//     }


//00000000000000000000000000

// public static void main(String[] args) {
//     Predicate<Integer> salaryGreaterThanOneLac=x->x>100000;
//     System.out.println(salaryGreaterThanOneLac.test(1000000));
// }

//000000000000000000000000000000


// public static void main(String[] args) {
//     Predicate<Integer>isEven=x->x%2==0;
//     Predicate<String> startsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
//     System.out.println(startsWithLetterV.test("vinod"));
// }


//000000000000000000000000000

//and

// public static void main(String[] args) {
//     Predicate<String> startsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
//     Predicate<String> endsWithLetterV=x->x.toLowerCase().charAt(x.length()-1)=='l';
//     Predicate<String> and = startsWithLetterV.and(endsWithLetterV);
//     System.out.println(and.test("Vipul")+" \n "+"vipul");
// }

//0000000000000000000000000000000000

//or

// public static void main(String[] args) {
//     Predicate<String> startsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
//     Predicate<String> endsWithLetterV=x->x.toLowerCase().charAt(x.length()-1)=='l';
//     Predicate<String> or = startsWithLetterV.or(endsWithLetterV);
//     System.out.println(or.test("Vivek"));//koi ek shahi hona chahiye
// }
    

//000000000000000000000000000000

//negate


    // public static void main(String[] args) {
    //     Predicate<String> startsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
    //     Predicate<String> endsWithLetterV=x->x.toLowerCase().charAt(x.length()-1)=='l';
        
    //     System.out.println(startsWithLetterV.negate().test("vopul"));//v name wale false ho jayega
    // }

    //00000000000000000000000000

    // isEqual

    public static void main(String[] args) {
        Predicate<String> startsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
        Predicate<String> endsWithLetterV=x->x.toLowerCase().charAt(x.length()-1)=='l';
        Predicate<Object> adarsh=Predicate.isEqual("vipul");
        System.out.println(adarsh.test("vipul"));  //dono name same hai true aayega
    }
}
 
