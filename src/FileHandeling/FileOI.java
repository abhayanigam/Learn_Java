package FileHandeling;
/*
    Java File Handling
    The File class from the java.io package, allows us to work with files.

    To use the File class, create an object of the class, and specify the filename or directory name:

    Example
        import java.io.File;                         // Import the File class
        File myObj = new File("filename.txt");      // Specify the filename
*/

// Creating  a File
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;  // Library to write in a file

public class FileOI {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
