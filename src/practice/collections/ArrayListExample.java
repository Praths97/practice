package practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayListExample al = new ArrayListExample();
        System.out.println(al.country());
        System.out.println(al.numbersList());
        System.out.println(al.addNumbers());
    }

    public List<String > country() {
        List<String> l = new ArrayList<String>();
        l.add("India");
        l.add("Canada");
        l.add("Australia");
        l.add("USA");
        l.add("Singapore");
        return l;
    }

    public List<Integer> numbersList() {
        List<Integer> n = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            n.add(i);
        }
        return n;
    }

    public List<Integer> addNumbers() {
        List<Integer> num = new ArrayList<Integer>();
        num.addAll(numbersList());
        for (int i = 11; i <= 15; i++) {
            num.add(i);
        }
        return num;
    }
}


