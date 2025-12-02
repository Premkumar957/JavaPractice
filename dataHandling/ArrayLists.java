package datahandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;

public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        

        List<String> list1 = new ArrayList<>();

        
        System.out.println(list1);

        String[] arr1 = { "A", "B", "C" };

        List<String> list2 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(list2);

        var list3 = new ArrayList<>(List.of("one", "two"));
        list3.add("three");
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>(List.of(1));
        System.out.println(list4);

        int n = list4.size();
        System.out.println(n);

        System.out.println(list4.contains(1));

        list4.clear();

        System.out.println(list4.isEmpty());

        List<Boolean> list5 = new ArrayList<>(List.of(false, true, false, false));
        for (int i = 0; i < list5.size(); i++) {
            System.out.println(list5.get(i));
        }

        List<Double> list6 = new ArrayList<>(List.of(10.5, 20.5, 30.5, 40.5));
        for (Double b : list6) {
            System.out.println(b);
        }

        list6.forEach(System.out::println);

        ArrayList<Integer> list7 = new ArrayList<Integer>(List.of(50, 10, 35, 2, 10));
        Collections.sort(list7);
        System.out.println(list7);

        int index = Collections.binarySearch(list7, 5);
        System.out.println("Found at index: " + index);

        System.out.println(Collections.min(list7));
        System.out.println(Collections.max(list7));

        System.out.println(Collections.frequency(list1, "A"));

        System.out.println("IndexOfSubList: " + Collections.indexOfSubList(list7, List.of(10)));
        System.out.println("LastIndexOfSubList: " + Collections.lastIndexOfSubList(list7, List.of(10)));

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4));

        Collections.reverse(nums);
        System.out.println("Reverse: " + nums);

        Collections.shuffle(nums);
        System.out.println("Shuffle: " + nums);

        Collections.swap(nums, 0, 1);
        System.out.println("Swap 0 & 1: " + nums);

        Collections.fill(nums, 9);
        System.out.println("Fill 9: " + nums);

        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 1));
        Collections.replaceAll(list, 1, 99);
        System.out.println("Replace 1→99: " + list);

        List<Integer> src = List.of(10, 20, 30);
        List<Integer> dest = new ArrayList<>(Arrays.asList(0, 0, 0));
        Collections.copy(dest, src);
        System.out.println(dest);

        
        List<String> emptyList = Collections.emptyList();
        Set<Integer> emptySet = Collections.emptySet();
        Map<Integer,String> emptyMap = Collections.emptyMap();

        System.out.println(emptyList);
        System.out.println(emptySet);
        System.out.println(emptyMap);
         

    }
}