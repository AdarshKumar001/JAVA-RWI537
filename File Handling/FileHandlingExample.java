
import java.io.*;
class FileHandlingExample {
public static void main(String[] args) {
    
        File f=new File("C:\\Users\\Adarsh kumar\\desktop\\vikash25.txt");
    try {
        if(f.createNewFile()){
           System.out.println("sucess");
           System.out.println(f.length());
           System.out.println(f.canRead());
           System.out.println(f.canWrite());
           System.out.println(f.getName());
           System.out.println(f.getAbsolutePath());
           System.out.println(f.list());
           System.out.println(f.canRead());
           System.out.println(f.canWrite());
        }
    } catch (IOException e) {
        System.out.println("not "+e);
        
    }

}
    
}
