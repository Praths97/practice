package exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

    public static int averageOfMarks(Map<Integer, Integer> m1) {
        int number = 0, count = 0;
        Iterator<Integer> i = m1.keySet().iterator();
        while (i.hasNext()) {
            Integer b = i.next();
            if (b % 2 != 0) {
                count++;
                number = number + m1.get(b);
            }
        }
        return (number / count);
    }

    public static void main(String[] args) {
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        m1.put(1, 89);
        m1.put(2, 98);
        m1.put(3, 92);
        m1.put(4, 74);
        m1.put(5, 67);
        System.out.println("avg of odd keys =" + averageOfMarks(m1));
    }
}

