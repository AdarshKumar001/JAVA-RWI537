import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFile {
    public static void main(String[] args)  throws IOException{
        FileInputStream r=new FileInputStream("C:\\Users\\Adarsh kumar\\desktop\\ajeet.txt");
        FileOutputStream w=new FileOutputStream("C:\\Users\\Adarsh kumar\\desktop\\Adarsh48.txt");
        int i;
    while((i=r.read())!=-1){
        w.write((char)i);
         
        
        }
       System.out.println("data copied");
    }
}

