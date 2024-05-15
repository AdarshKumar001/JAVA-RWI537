import java.time.LocalDateTime;

public class local8dateTime {
    public static void main(String[] args) {
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);
        LocalDateTime myDateTime=LocalDateTime.parse("2024-05-16T01:03");
        System.out.println(myDateTime);
        LocalDateTime min=today.minusHours(1);
        System.out.println(min);
        LocalDateTime max=myDateTime.minusDays(1);
        System.out.println(max);
    }
    
}
