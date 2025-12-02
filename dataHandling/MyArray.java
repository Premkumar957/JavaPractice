package datahandling;
import java.util.*;

public class MyArray {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");
        
        int[] num1 = {1, 2, 3, 4, 6};
        int[] num2 = {1, 2, 5, 4, 6};

        String[] name = {"Prem", "kumar", "izack"};
        System.out.println(num1);

        //System.out.println(num1[0]);
        //System.out.println(name[0]);

        System.out.println(Arrays.compare(num1, num2));

        System.out.println(num1.equals(num2));

        System.out.println(Arrays.equals(num1, num2));

        int[] n = {50, 30, 40, 10, 20};
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));

        Arrays.fill(n,10);
        System.out.println(Arrays.toString(n));

        System.out.println(n.length);

        int[] num3 = Arrays.copyOf(num1, num1.length);
        System.out.println(Arrays.equals(num1, num3));

        String[] name1 = {"Prem", "Kumar", "izack"};
        System.out.println(Arrays.deepEquals(name, name1));

        System.out.println(Arrays.mismatch(name, name1));
    }
}