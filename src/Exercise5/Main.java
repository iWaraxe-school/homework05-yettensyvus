package Exercise5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap to store countries as keys and another HashMap as values
        HashMap<String, HashMap<String, String>> countries = new HashMap<>();

        // Add details for Moldova
        HashMap<String, String> moldovaInfo = new HashMap<>();
        moldovaInfo.put("Capital", "Chisinau");
        moldovaInfo.put("Population", "2.6 million");
        countries.put("Moldova", moldovaInfo);

        // Add details for Romania
        HashMap<String, String> romaniaInfo = new HashMap<>();
        romaniaInfo.put("Capital", "Bucharest");
        romaniaInfo.put("Population", "19.5 million");
        countries.put("Romania", romaniaInfo);

        // Add details for Ukraine
        HashMap<String, String> ukraineInfo = new HashMap<>();
        ukraineInfo.put("Capital", "Kyiv");
        ukraineInfo.put("Population", "41 million");
        countries.put("Ukraine", ukraineInfo);

        // Add details for Belarus
        HashMap<String, String> belarusInfo = new HashMap<>();
        belarusInfo.put("Capital", "Minsk");
        belarusInfo.put("Population", "9.3 million");
        countries.put("Belarus", belarusInfo);

        // Display information for each country
        System.out.println("Country Information:");
        for (String country : countries.keySet()) {
            System.out.println("Country: " + country);
            HashMap<String, String> info = countries.get(country);
            System.out.println("  Capital: " + info.get("Capital"));
            System.out.println("  Population: " + info.get("Population"));
        }
    }
}
