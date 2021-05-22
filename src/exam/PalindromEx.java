package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PalindromEx {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the range:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println("sum of palindrome nos.within given range is:" + sumOfPalindromeNos(n1, n2));
    }

    public static int sumOfPalindromeNos(int n1, int n2) {
        int sum = 0;
        List<Integer> l1 = new ArrayList<Integer>();
        for (int i = n1; i <= n2; i++) {
            int r = 0, n3 = i;
            while (n3 != 0) {
                r = (r * 10) + (n3 % 10);
                n3 = n3 / 10;
            }
// System.out.println(n3);
            if (r == i) {

                sum = sum + i;
                l1.add(i);

            }

        }
        System.out.println(l1.toString());
        return sum;
    }
}