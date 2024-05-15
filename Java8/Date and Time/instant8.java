import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class instant8 {
    public static void main(String[] args) {
        long CurrentTimeMillis= System.currentTimeMillis();
        System.out.println(CurrentTimeMillis);  //millisecond output
        
        Instant today= Instant.now();
        System.out.println(today);//nanosecond output
        // ZonedDateTime zonedDateTime=today.atZone(ZoneId.of("India"));
        // System.out.println(zonedDateTime);
        
    }
    
}
