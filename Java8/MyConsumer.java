import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class MyConsumer {
    public static void main(String[] args) {
        Consumer<String> adarsh = s -> System.out.println(s);
        adarsh.accept("Vipul");
        Consumer<List<Integer>> listConsumer1= li-> {
            for(Integer i : li){
                System.out.println(i+100);
            }
        };
        listConsumer1.accept(Arrays.asList(1,2,3));


        Consumer<List<Integer>> listConsumer2= li-> {
            for(Integer i : li){
                System.out.println(i);
            }
        };
        listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4,5));
    }
}
