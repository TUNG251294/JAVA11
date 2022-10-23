package Lesson11;

import java.util.HashMap;

public class TreeMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        for(String i: capitalCities.keySet()){
            System.out.println(i);
        }
        for (String i: capitalCities.values()){
            System.out.println(i);
        }
        for(String i: capitalCities.keySet()){
            System.out.println("key: " + i + ", value: " + capitalCities.get(i));
        }
//        System.out.println(capitalCities);
//        System.out.println(capitalCities.get("England"));
//        capitalCities.remove("England");
//        System.out.println(capitalCities);
//        System.out.println(capitalCities.size());
//        capitalCities.clear();
//        System.out.println(capitalCities);
    }
}
