import java.util.*;
public class IteratorExample {
    public static void main(String[] args) {

        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Iterator it=  numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}