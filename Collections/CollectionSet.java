
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
     public static void main(String[] args) {
        Set<Integer> l = new HashSet(); // Use generic type for ArrayList
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(null);
        l.add(null);
        System.out.println(l);

        Iterator<Integer> itr = l.iterator(); // Use Iterator<Integer>
        while(itr.hasNext()) { // Remove unintended semicolon
            System.out.println(itr.next()); // Print each element in the list
        }
    }
}

