package practice.collections;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hm = new TreeMap<Integer, String>();
        addElements(hm);
        // Set<Integer> keys = hm.keySet();
        Set<Map.Entry<Integer,String>> entries= hm.entrySet();
        for (Map.Entry<Integer,String> s : entries) {
            System.out.println(s.getKey() + "" + s.getValue());
        }
    }

    public static void addElements(Map<Integer, String> hm) {
        hm.put(1, "Viha");
        hm.put(2, "Chinna");
        hm.put(3,"Praths");
    }
}


