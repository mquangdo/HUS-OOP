package hus.oop.lab08.question3;

import java.util.*;
public class Maps {
    public static int count(Map<Integer,Integer> map){
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                count++;
            }
        }
        return count;
    }
    public static boolean contains(Map<Integer,Integer> map, int key){
        return map.containsKey(key);
    }
    public static boolean containsKeyValue(Map<Integer,Integer> map, int key, int value){
        return map.containsKey(key) && map.containsValue(value);
    }
    public static Set<Integer> keySet(Map<Integer,Integer> map){
        return map.keySet();
    }
    public static Collection<Integer> values(Map<Integer,Integer> map){
        return map.values();
    }
    public static String getColor(int value){
        if(value > 2 || value < 0){
            return "Invalid";
        }
        Map<Integer,String> map = new HashMap<>();
        map.put(0, "Black");
        map.put(1, "White");
        map.put(2, "Red");
        return map.get(value);
    }
}
