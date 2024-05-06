import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
   
     public static void main(String[] args) {
        try {
            FileWriter mydata = new FileWriter("C:\\Users\\Adarsh kumar\\desktop//vikash25.txt");
            mydata.write("hello railworld india ");
            mydata.write("java language is a best programming language in this world /n");
            mydata.close();
            System.out.println("Successfully");
        }
        catch (IOException e) {
            System.out.println("something exception " + e );

        }
    }
    
}
