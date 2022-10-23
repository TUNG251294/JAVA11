package Lesson11.ToCountWord;

import java.util.Arrays;
import java.util.TreeMap;

public class ToCountWord {
    public static void main(String[] args) {
        TreeMap<String,Integer> myMap = new TreeMap<>();
        myMap.put("i",1);
        myMap.put("l",1);
        myMap.put("m",1);
        String str = "I love you forever";
        String lowerStr = str.toLowerCase();
        char[] charArr = lowerStr.toCharArray();
        System.out.println(Arrays.toString(charArr));

//        Set<String> keys = myMap.keySet();

        for (Character c: charArr){
            if (myMap.containsKey(c.toString())){
                myMap.replace(c.toString(),myMap.get(c.toString())+1);
            } else {
                myMap.put(c.toString(),1);
            }
        }
        System.out.println(myMap);
    }
}
