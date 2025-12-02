package datahandling;
import java.util.LinkedHashSet;
import java.util.Iterator;
// import java.util.List;
import java.util.Set;
import java.util.Collections;

public class LinkedHashSets {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("audi");
        cars.add("Benz");
        cars.add("Toyota");
        cars.add("maruti");

        cars.add("Maruti");

        System.out.println(cars.size());

        for (String car: cars) {
            System.out.println(car);
        }

        Iterator<String> vechile = cars.iterator();
        while (vechile.hasNext()) {
            System.out.println(vechile.next());
        }

        cars.forEach(System.out::println);

        LinkedHashSet<Integer> nums = new LinkedHashSet<>(Set.of(1, 4));
        Collections.addAll(nums, 3, 2, 10);
        System.out.println(nums);

        Set<Double> marks = new LinkedHashSet<>(Set.of(98.5, 88.9, 95.5));
        System.out.println(marks);




    }
}
