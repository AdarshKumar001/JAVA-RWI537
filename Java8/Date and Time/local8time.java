import java.time.LocalTime;

public class local8time {
    public static void main(String[] args) {
        LocalTime today=LocalTime.now();
        System.out.println(today);
        LocalTime costomTime= LocalTime.of(14, 30, 15);//second ko hata bhi sakte hai
        System.out.println(costomTime);
        LocalTime parsedTime = LocalTime.parse("15:30");
        System.out.println(parsedTime);
        LocalTime BeforeOneHourse= today.minusHours(1);
        System.out.println(BeforeOneHourse);
        if(today.isAfter(BeforeOneHourse)){
            System.out.println("haa Bhai");
        }

    }
    
}
