import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection3 {    //list collection hai
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(); // Use generic type for ArrayList
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);

        Iterator<Integer> itr = l.iterator(); // Use Iterator<Integer>
        while(itr.hasNext()) { // Remove unintended semicolon
            System.out.println(itr.next()); // Print each element in the list
        }
    }
}
