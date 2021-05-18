package practice.dateexamples;

import java.time.*;

public class AllMethodsDateTime {
    public static void main(String[] args) {
        // To get today's date
      /*  LocalDate today=LocalDate.now();
        System.out.println(today);
        // To get today's time
        LocalTime time=LocalTime.now();
        System.out.println(time);
        //To add extra time to present time
        LocalTime extra=time.plusHours(3);
        System.out.println(extra);
        // To represent timeZone
        Clock clock=Clock.systemUTC();
        System.out.println(clock);
        // To print the given date
        LocalDate dob=LocalDate.of(2021,06,15);
        System.out.println(dob);
        // To know the current time of that zone*/
        ZoneId asia=ZoneId.of("Asia/Tokyo");
        LocalTime id1 = LocalTime.now(asia);
        System.out.println(id1);
        // To know the date and time at a time
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        // To know the date and extra time between time zones
        ZonedDateTime newdt=ZonedDateTime.of(dateTime,asia);
        System.out.println(newdt);
        
    }
}
