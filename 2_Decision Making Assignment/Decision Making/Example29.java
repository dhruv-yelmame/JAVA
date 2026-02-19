// Q29. Write a Java program to calculate total electricity bill according to given conditions
/*
    For first 50 units  -> Rs. 0.50/unit
    For next 100 units  -> Rs. 0.75/unit
    For next 100 units  -> Rs. 1.20/unit
    For units above 250 -> Rs. 1.50/unit
    Additional surcharge = 20%
*/

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        double unit = sc.nextDouble();
        double bill = 0, surcharge = 0, total;

        if (unit > 250) {
            bill += (unit - 250) * 1.50;
            unit = 250;
        }
        if (unit > 150) {
            bill += (unit - 150) * 1.20;
            unit = 150;
        }
        if (unit > 50) {
            bill += (unit - 50) * 0.75;
            unit = 50;
        }
        if (unit <= 50) {
            bill += unit * 0.50;
        }

        surcharge = bill * 0.20;
        total = bill + surcharge;

        System.out.println("Bill before surcharge: Rs. " + bill);
        System.out.println("Additional surcharge (20%): Rs. " + surcharge);
        System.out.println("Total Bill to Pay: Rs. " + total);
    }
}
