import java.util.ArrayDeque;

public class DequeCollection {
    public static void main(String[] args) {
        
    ArrayDeque<String> name=new ArrayDeque<String>();  //fifo
    name.add("adarsh");
    name.add("Modi");
    name.add("Ajeet");
    System.out.println(name); 
    name.remove();
    System.out.println(name);  
    name.pop();
    System.out.println(name);
    
    }
}
