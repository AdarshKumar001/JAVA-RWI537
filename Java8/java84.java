import java.util.*;

public class java84 {
    public static void main(String[] args) {
        Set<Integer> s= new TreeSet<>();
        s.add(5);
        s.add(0);
        s.add(22);
        s.add(15);
        System.out.println("Before manual sorting"+s);
        Set<Integer> ss= new TreeSet<>((a,b) -> b-a);
        ss.add(5);
        ss.add(0);
        ss.add(22);
        ss.add(15);
        System.out.println("After manual sorting desc: "+ss);

    }


    // public static void main(String[] args) {
    //     Map<Integer, String> s1 = new TreeMap<>();
    //     s1.put(2, "Ajeet");
    //     s1.put(1, "Aju");
    //     s1.put(3, "Ajamer");
    //     s1.put(4, "Abhinas");
    //     System.out.println("Before manual sorting: " + s1);

    //     // TreeMap with custom comparator to sort by keys in descending order
    //     Map<Integer, String> s2 = new TreeMap<>((a,b)-> b-a);
    //     s2.putAll(s1); // Copy elements from s1 to s2
    //     System.out.println("After manual sorting desc: " + s2);
    // }


    
}
