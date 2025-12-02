package filehandling;
import java.io.File;   // Import the File class
import java.io.IOException;


public class CreateFiles {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");
        
        //Creating file
        try {
            File myObj = new File("filehandling/content.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();   //Print error details
        }


        
        
        
    }
}