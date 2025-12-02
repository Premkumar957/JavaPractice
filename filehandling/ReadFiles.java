package filehandling;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ReadFiles {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be");

        ArrayList<String> arr = new ArrayList<>();
        File myObj = new File("filehandling/content.txt");
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                arr.add(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }

        System.out.println(arr);



        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("Writable: " + myObj.canWrite());
            System.out.println("File size in bytes:" + myObj.length());
            System.out.println(myObj.getAbsoluteFile());
        }


    }
}