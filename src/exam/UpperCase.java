package exam;

import java.util.HashMap;
import java.util.Map;

public class UpperCase {
    public static void main(String[] args) {
        Map<String, String> upmap = new HashMap<>();
        String a1[] = new String[]{"goa", "kerala", "gujarat"};
        for (String s : a1) {
            upmap.put(s.substring(0, 3).toUpperCase(), s);
        }
        System.out.println(upmap);
    }
}
