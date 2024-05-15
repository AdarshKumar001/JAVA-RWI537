import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

import javax.lang.model.type.ArrayType;

public class StreamsExplain {
    // public static void main(String[] args) {
    // int[] array = {11,22,33,44,55};
    // int sum = 0;
    // for(int i = 0; i < array.length; i++){
    // if(array[i] % 2 == 0){
    // sum += array[i];
    // }
    // }
    // System.out.println("Sum using for loop: " + sum);

    // //Stream
    // // Using stream to calculate sum of even numbers
    // int[] array2 = {11,22,33,44,55};
    // int sum2 = Arrays.stream(array2)
    // .filter(n -> n % 2 == 0)
    // .sum(); // Use .sum() to get the sum of filtered values

    // System.out.println("Sum using streams: " + sum2);
    // }

    // 0000000000000000000000000000000000

    // //strwam created of multilr types
    // public static void main(String[] args) {
    // //type-1
    // List<String> list= Arrays.asList("Adarsh","Babita","Ajeet");
    // Stream<String> myStream= list.stream();
    // //type=2
    // String[] array={"apple","Banana","cherry"};
    // Stream<String>stream= Arrays.stream(array);
    // //type=3
    // Stream<Integer> integerStream= Stream.of(1,2,3);
    // //type=4
    // Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
    // //type=5
    // Stream<String> limit1=Stream.generate(()->"Hello").limit(5);
    // }

    // 0000000000000000000000000000000000

   // public static void main(String[] args) {
        // List<Integer> list= Arrays.asList(11,22,33,44,55,66,66,44,22,77,88,99,100);
        // List<Integer> filterList=list
        // .stream()
        // .filter(x->x%2==0).distinct()
        // .sorted((a,b)->(b-a))
        // //.limit(2) //stsrting ke elements ko show karta hai
        // //.skip(1) //starting ke element ko skip karna chahte hai
        // .collect(Collectors
        // .toList());
        // System.out.println(filterList);
        // List<Integer>
        // mappedList=filterList.stream().map(x->x/2).collect(Collectors.toList());
        // System.out.println(mappedList);
        //}

        //000000000000000000000000000000000000000000000
//         public static void main(String[] args) {
//         List<Integer> collect = Stream
//         .iterate(0, x -> x + 1)
//         .limit(101)
//         .skip(1)
//         .filter(x -> x % 2 == 0)  // Corrected filter condition
//         .map(x -> x / 10)
//         .distinct()
//         .sorted()
//         .peek(x -> System.out.println(x))
//         .collect(Collectors.toList());

//     System.out.println(collect);
// }



public static void main(String[] args) {
    Integer iterate=Stream.iterate(0, x->x+1)
    .limit(101)
    .map(x->x/20)
    .distinct()
    .peek(x-> System.out.println(x))
    .max((a,b)->(a-b)).get();
    System.out.println(iterate);//5
   }
}
