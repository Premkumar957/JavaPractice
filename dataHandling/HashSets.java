package datahandling;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        HashSet<String> cars = new HashSet<String>();
        cars.add("Audi");
        cars.add("Benz");
        cars.add("Ferrari");
        cars.add("Toyota");
        cars.add("Audi");

        cars.remove("Audi");
        
        System.out.println(cars.contains("Benz"));
        System.out.println(cars.size());

        for (String car : cars) {
            System.out.println(car);
        }

        HashSet<Integer> set = new HashSet<>(List.of(10, 20, 30, 40, 40));

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        Set<Integer> nums = new HashSet<Integer>();

        //Add values to the set
        nums.add(4);
        nums.add(7);
        nums.add(8);

        for (int i = 0; i <= 10; i++) {
            if (nums.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }

        Set<Double> salary = new HashSet<>();
        salary.add(null);
        salary.add(800000.0);

        Set<Double> salary1 = new HashSet<>();
        salary1.add(10.0);
        salary.addAll(salary1);
        System.out.println(salary);


    }
}
