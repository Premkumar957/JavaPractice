package datahandling;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;


public class TreeSets {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        TreeSet<String> cars = new TreeSet<>();
        cars.add("Audi");
        cars.add("Benz");
        cars.add("Toyoto");
        cars.add("Bugatti");
        System.out.println(cars.remove("audi"));
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        cars.removeLast();
        cars.removeFirst();
        cars.clear();
        System.out.println(cars);

        for (String car: cars) {
            System.out.println(car);
        }


        Set<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        numbers.add(203);
        numbers.add(35);
        System.out.println(numbers);

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        numbers.forEach(System.out:: println);
    }
}