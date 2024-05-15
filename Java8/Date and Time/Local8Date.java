import java.time.LocalDate;

public class Local8 {
    // public static void main(String[] args) {
    //     LocalDate now = LocalDate.now();
    //     LocalDate customDate = LocalDate.of(1999, 2, 7);

    //     System.out.println("Current Date: " + now);
    //     System.out.println("Custom Date: " + customDate);

    //     int dayOfMonth=now.getDayOfMonth();
    //     int month= now.getMonthValue();
    //     int year= now.getYear();
    //     System.out.println(dayOfMonth);
    //     System.out.println(month);
    //     System.out.println(year);
    // }

    //0000000000000000000000

    public static void main(String[] args) {
        LocalDate today= LocalDate.now();
        System.out.println(today);
        LocalDate costomDate=LocalDate.of(1990, 2, 7);
        System.out.println(costomDate);
        LocalDate yesterday=today.minusDays(1);
        System.out.println(yesterday);
        if(today.isAfter(yesterday)){
            System.out.println("Haa bhai");
        }
        LocalDate pastDate= today.minusMonths(100);
        System.out.println(pastDate);
    }
}
