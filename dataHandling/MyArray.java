import java.util.*;

public class MyArray {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");
        
        String[] cars = {"Volvo", "bMW", "Tesla", "ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);


        int[] numbers = {10, 50, 30, 20, 40};
        Arrays.sort(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }
}