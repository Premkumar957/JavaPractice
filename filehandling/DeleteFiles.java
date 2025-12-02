package filehandling;

import java.io.File;

public class DeleteFiles {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        File folder = new File("E:\\Project\\JavaPractice");
        File[] files = folder.listFiles();
        for (File f: files) {
            if (f.isFile() && f.getName().endsWith(".java")) {
                System.out.println(f.getName());
                System.out.println("File size in bytes: " + f.getName() + " " + f.length());
            }
        }

        for (File f: files) {
            if (f.isDirectory()) {
                File[] inner = f.listFiles();
                for (File file : inner) {
                    System.out.println(file.getName());
                }
            }
        }

        File file = new File("filehandling/sample.txt");
        System.out.println(file.delete());




    }
}