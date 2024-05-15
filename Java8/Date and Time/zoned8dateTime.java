import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class zoned8dateTime {
    // public static void main(String[] args) {
    //     ZonedDateTime thisTime=ZonedDateTime.now();
    //     System.out.println(thisTime);

    //     Set<String> availableZoneId= ZoneId.getAvailableZoneIds();
    //     //availableZoneId.forEach(System.out::println);
    //     ZonedDateTime America=ZonedDateTime.of(2024, 5, 16, 1, 17, 30, 30,
    //      ZoneId.of("America/Creston"));
    //      System.out.println(America);
    // }

    //000000000000000000000

    public static void main(String[] args) {
        ZonedDateTime indianTime=ZonedDateTime.now();
        System.out.println("Current time in indian:"+indianTime);
        ZonedDateTime NewYorkTime= ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in NewYork:"+NewYorkTime);
    }
    
}
