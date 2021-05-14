package practice.dateexamples;

import java.time.LocalDate;

public class CreditCardExpiry {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(2025, 10, 25);
        int year = today.getYear();
        int month = today.getMonthValue();
        if (year == dob.getYear()) {
            if (month > dob.getMonthValue()) {
                System.out.println("card is expired");

            } else {
                System.out.println("you can use the card");
            }
        } else {
            System.out.println("you can use the card");
        }
    }


}

