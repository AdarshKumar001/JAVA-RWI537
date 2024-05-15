import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter8 {
    public static void main(String[] args) {
        String dateTime = "2001-04-25 10:15:30 UTC";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTime, formatter);
        System.out.println(zonedDateTime);
    }
}

