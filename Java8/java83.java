import java.util.*;

public class java83 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(11);
        list.add(55);
        list.add(0);
        Collections.sort(list,(a,b) ->b-a);//lambda exprestion
        System.out.println(list);


    }
    
}
