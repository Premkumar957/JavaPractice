package datahandling;
import java.util.HashMap;
// import java.util.Iterator;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "oslo"); //Duplicate
        capitalCities.put("USA", "washington DC");

        // capitalCities.remove("Norway");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("India"));

        System.out.println(capitalCities.containsKey("India"));

        System.out.println(capitalCities.keySet());

        System.out.println(capitalCities.size());

        for (String capital : capitalCities.keySet()) {
            System.out.println(capitalCities.get(capital));
        }

        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        capitalCities.forEach((key, value) -> {
            System.out.println(key + " == " + value);
        });

        Map<String, Integer> people = new HashMap<>();

        //Add keys and values (name, age)
        people.put("John", 32);
        people.put("Premkumar", 21);
        people.put("Izack", 22);

        for (String i: people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }

        
    }
}




