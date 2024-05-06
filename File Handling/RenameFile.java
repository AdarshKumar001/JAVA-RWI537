import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File originalname=new File("C:\\\\Users\\\\Adarsh kumar\\\\desktop\\\\vikash25.txt");
        File rename=new File("C:\\Users\\Adarsh kumar\\desktop\\ajeet.txt");
if(originalname.exists()){
   System.out.println(originalname.renameTo(rename)+" successfully changed name ");

}
else {
   System.out.println("File doest not exits");
}

  }
    }
    

