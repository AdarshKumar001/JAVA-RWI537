import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> x * x;
        System.out.println(function1.apply(4));
        //or
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));

        Function<String, String> function2 = str -> str.toLowerCase();
        System.out.println(function2.apply("AdarshKUmar"));
        //or
        UnaryOperator<String> unaryOperator2= str->str.toLowerCase();
        System.out.println(unaryOperator2.apply("AJEETSINGH"));

        //BinaryOperator

        BiFunction<String,String,String> biFunction= (str1, str2)-> str2+str1;
        System.out.println(biFunction.apply("Hello", "Ajeet"));
        //or
        BinaryOperator<String> binaryOperator= (str1,str2)->str1+str2;
        System.out.println(binaryOperator.apply("Hello", "Adarsh"));
    }
}
