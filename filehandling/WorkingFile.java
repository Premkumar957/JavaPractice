package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WorkingFile {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        try (BufferedReader br = new BufferedReader(new FileReader("filehandling/content.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filehandling/names.txt"))) {
            bw.write("First line");
            bw.newLine();  //add line break;
            bw.write("Second line");
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }



    }
}
