package FileHandeling;
import java.io.File;   // Import the file class

public class GetFileInfo {
    public static void main(String[] args) {
        File obj = new File("filename.txt");
        if (obj.exists()){
            System.out.println("File name : " + obj.getName());
            System.out.println("Absolute Path : " + obj.getAbsolutePath());
            System.out.println("Writeable : " + obj.canWrite());
            System.out.println("Readable length : " + obj.length());
        }else{
            System.out.println("The file does not exist.");
        }
    }
}
