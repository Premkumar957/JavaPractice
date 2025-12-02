package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");
        
        try {
            File myObj = new File("filehandling/content.txt");
        
            FileWriter myWriter = new FileWriter(myObj, true);
            myWriter.write("\nPremkumar S");
            myWriter.close();
            System.out.println("Content added successfully");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
