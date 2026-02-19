//Q18. Write a Java program to convert days to years, month and week.

import java.util.Scanner;
public class YMW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}
