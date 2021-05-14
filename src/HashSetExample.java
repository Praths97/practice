
import java.util.HashSet;

import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        ArrayListExample al = new ArrayListExample();
        System.out.println(al.country());
        System.out.println(al.numbersList());
        System.out.println(al.addNumbers());
    }

    public  Set<String> country() {
        Set<String> s = new HashSet<String>();
        s.add("India");
        s.add("Canada");
        s.add("Australia");
        s.add("USA");
        s.add("Singapore");
        return s;
    }

    public Set<Integer> numberslist() {
        Set<Integer> n = new HashSet<Integer>();
        for (int i = 1; i <= 10; i++) {
            n.add(i);
        }
        return n;
    }

    public Set<Integer> addNumbers() {
        Set<Integer> num = new HashSet<Integer>();
        num.addAll(numberslist());
        for (int i = 11; i <= 15; i++) {
            num.add(i);
        }
        return num;
    }
}




