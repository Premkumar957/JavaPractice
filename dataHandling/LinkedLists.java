package datahandling;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;


public class LinkedLists {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        List<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        cars.add("Volkswagen");


        //Add item to the beginning of LinkedList
        cars.addFirst("Audi");
        //Add item to the end of LinkedList
        cars.addLast("Ferrari");

        //remove the first item of LinkedList
        cars.removeFirst();
        //remove the last item of LinkedList
        cars.removeLast();
        
        //Get the first item of Linkedlist
        System.out.println(cars.getFirst());
        //Get the last Item of Linkedlist
        System.out.println(cars.getLast());

        ListIterator<String> it = cars.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        LinkedList<Integer> nums = new LinkedList<Integer>(List.of(50, 40, 30, 10, 20));
        Collections.sort(nums);
        System.out.println(nums.get(0));




    }

}

