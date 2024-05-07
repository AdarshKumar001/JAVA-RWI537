import java.util.Stack;

public class StackColle {
    public static void main(String[] args) {
        Stack<String> name=new Stack<>();  //LIFO
        name.push("Adarsh kumar");
        name.push("Ajeet");
        name.push("Vivek singh");
        System.out.println(name);
        name.pop();
        System.out.println(name);
    }
    
}
