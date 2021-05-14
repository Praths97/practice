package practice.dateexamples;

import java.time.LocalDate;
import java.util.Objects;

public class DateTimeExample {
    public static final int day=12;
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
       // LocalDate dob = LocalDate.of(2021, 05, 15);
        //int day = today.getDayOfMonth();
        System.out.println(day);

        if (day == today.getDayOfMonth())
            System.out.println("its time to pay the bills");
        else{
            System.out.println("still there is some time to pay the bills");
        }
    }
}

