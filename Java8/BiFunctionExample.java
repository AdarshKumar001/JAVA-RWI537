import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {

        //BiPredicate
        Predicate<Integer> predicateThatCheackEven= x->x%2==0;
        BiPredicate<Integer,Integer> biPredicate=(x,y)->x%2==0 && y%2==0;
        System.out.println(biPredicate.test(2, 4));

        BiPredicate<String,Integer> biPredicate2= (str,x)->str.length()==x;
        System.out.println(biPredicate2.test("Adarsh", 6));

        //Bifunction

        Function<String,Integer> function= str->str.length();
        BiFunction<String,String,Integer> biFunction=(x,y)->x.length() + y.length();
        System.out.println(biFunction.apply("Hello", "Adarsh"));

        //Biconsumer

        Consumer<Integer> consumer=x->{
            System.out.println(x);
        };
        consumer.accept(55);

        BiConsumer<Integer,Integer> biConsumer=(x,y)->{
            System.out.println(x+y);
        };
        biConsumer.accept(5, 2);
        
    }

    //BiSupplier nahi hota hai
    
}
