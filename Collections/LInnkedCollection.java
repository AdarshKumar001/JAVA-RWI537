import java.util.LinkedList;

public class LInnkedCollection {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("adarsh");
        name.add("Ankit");
        name.add("Ankush");
        System.out.println(name);
        name.addFirst("Rohit");
        System.out.println(name);
        name.addLast("Amir");
        System.out.println(name);
        name.add(2, "Anish");
        System.out.println(name);
        name.remove(4); // ankus ko delet
        System.out.println(name);
        name.removeFirst();
        System.out.println(name);
        
    }

}
