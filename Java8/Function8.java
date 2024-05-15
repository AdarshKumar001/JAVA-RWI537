import java.util.function.Function;

public class Function8 {
    // public static void main(String[] args) {
    // Function<String,Integer> function=x->x.length();
    // System.out.println(function.apply("Adarsh"));
    // Function<String,String> function2=s->s.substring(0,3);
    // System.out.println(function2.apply("Abheesek"));

    // }

    // 00000000000000000000000

    // public static void main(String[] args) {
    //     Function<String, String> function1 = s -> s.toUpperCase();
    //     Function<String, String> function2 = s -> s.substring(0, 3);

    //     Function<String, String> stringStringFunction = function1.andThen(function2);
    //     System.out.println(stringStringFunction.apply("AdarshKumar"));
    //     //or
    //     System.out.println(function1.andThen(function2).apply("VivekKumar"));
    // }

    //00000000000000000000000000

    //andThen or compose
    // public static void main(String[] args) {
    //     Function<Integer,Integer> function1=x->2*x;
    //     Function<Integer,Integer> function2=x->x*x*x;

    //     System.out.println(function1.andThen(function2).apply(3));//216
    //     System.out.println(function2.andThen(function1).apply(3));//54
    //     //or
    //     System.out.println(function1.compose(function2).apply(3));//54

    // }

    //000000000000000000000000000

    //identity 

    public static void main(String[] args) {
        Function<String,String> identityFunction= Function.identity();
        System.out.println(identityFunction.apply("AdarshSingh"));

        //or

    
    }
    // private String idfunction(String s){
    //     return s;
    // }

}
