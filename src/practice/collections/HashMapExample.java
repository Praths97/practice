package practice.collections;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        addElements(hashMap);
        Set<Integer> keys = hashMap.keySet();
        for (Integer s : keys) {
            System.out.println(s + "" + hashMap.get(s));
        }
    }

    public static void addElements(Map<Integer, String> hashMap) {
        hashMap.put(1, "Viha");
        hashMap.put(2, "Chinna");
        hashMap.put(3,"Praths");
    }
}

