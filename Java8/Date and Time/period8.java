import java.time.LocalDate;
import java.time.Period;

public class period8 {
    public static void main(String[] args) {
        LocalDate now= LocalDate.now();
        LocalDate then= LocalDate.of(1990, 2, 12);
        
        Period period=Period.between(now, then);
        System.out.println(period);
    }
    // bade time or date ke sath khelte hai
    
}
