package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be");

        //Reading text using FileInputStream
        try (FileInputStream input = new FileInputStream("filehandling/content.txt")) {
            
            int i;   //varible to store each byte that is read

            //Read one byte at a time until end of file (-1 means "no more data")
            while ((i = input.read()) != -1) {
                // Convert the byte to a character and print it to the console
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }


        //Copy a Binary File  (Real world example)
        try (FileInputStream input = new FileInputStream("filehandling/image.jpg");
             FileOutputStream output = new FileOutputStream("filehandling/copy.jpg")) {
                int b;
                while ((b = input.read()) != -1) {
                    output.write(b);    //write each raw byte to the new file
                }
                System.out.println("File copied successfully");
             } catch (IOException e) {
                System.out.println("Error handling file");
                e.printStackTrace();
             }


        // Convert Text into bytes
        String text = "Become the programmer you are meant to be!";

        try (FileOutputStream output = new FileOutputStream("filehandling/content.txt")) {
            output.write(text.getBytes());  //convert text to bytes and write
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }

        //Writing text inside jpg file 
        try (FileOutputStream out = new FileOutputStream("filehandling/image.jpg", true)) {
            String secret = "Hello hidden message";
            out.write(secret.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Reading byte into text
        try (FileInputStream in = new FileInputStream("filehandling/image.jpg")) {
            int i;

            while ((i = in.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}