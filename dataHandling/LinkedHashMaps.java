package datahandling;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");

        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();
        capitalCities.put("Tamilnadu", "Chennai");
        capitalCities.put("Andhra", "Vishakapattinam");
        capitalCities.put("Telangana", "Hyderabad");
        capitalCities.put(null, "Goa");

        capitalCities.remove("Tamilnadu");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Tamilnadu"));

        System.out.println(capitalCities.containsKey("Andhra"));

        System.out.println(capitalCities.keySet());

        // capitalCities.clear();

        System.out.println(capitalCities.size());

        for (String key : capitalCities.keySet()) {
            System.out.println(key + " = " + capitalCities.get(key));
        }

        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        capitalCities.forEach((key, value) -> {
            System.out.println(key + " ==== " + value);
        });
    }
}