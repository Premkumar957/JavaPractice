package datahandling;
import java.util.TreeMap;
import java.util.Map;

public class TreeMaps {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("Tamilnadu", "Chennai");
        capitalCities.put("Karnataka", "Bengaluru");
        capitalCities.put("Telengana", "Hyderabad");
        capitalCities.put("Andhra", null);

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Tamilnadu"));

        capitalCities.remove("Telengana");

        System.out.println(capitalCities.size());

        // capitalCities.clear();
        // System.out.println(capitalCities);

        System.out.println(capitalCities.containsKey("Tamilnadu"));

        System.out.println(capitalCities.keySet());

        for (String key: capitalCities.keySet()) {
            System.out.println(capitalCities.get(key));
        }

        for (Map.Entry<String, String> entry: capitalCities.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        capitalCities.forEach((key, value) -> {
            System.out.println(key + " == " + value);
        });

        Map<String, Integer> students = new TreeMap<String, Integer>(Map.of(
            "Prem", 21,
            "Izack", 22
        ));
        System.out.println(students);

        Map<String, Integer> student = new TreeMap<>(Map.ofEntries(
            Map.entry("Prem", 21),
            Map.entry("Izack", 22)
        ));

        System.out.println(student);

        LinkedHashMaps.main(new String[0]);





    }
}