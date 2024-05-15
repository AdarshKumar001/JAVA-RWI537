import java.util.Optional;

public class Optional8 {
   
    
    //00000000000000000000000000000

    public static void main(String[] args) {
        Optional<String> name= getName(2);
        String nameTobeUsed= name.orElse("NA");
        System.out.println(nameTobeUsed);
    }

    private static Optional<String>getName(int id){
        return Optional.empty();
    }
    
}
