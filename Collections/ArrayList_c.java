import java.util.ArrayList;

public class ArrayList_c {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Adarsh");
        name.add("vivek");
        name.add("Ajeet");
        System.out.println(name);
        name.add("Anish");
        System.out.println(name);
        name.add(1, "rohit");
        System.out.println(name);
        name.add(0, "Amir");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
        name.set(2,"Aashis");
        System.out.println(name);
        System.out.println(name.get(0));
        name.clear();
        System.out.println(name);
    }

}
