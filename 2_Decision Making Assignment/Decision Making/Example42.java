/* Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.
 */

import java.util.*;

public class Example42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the minutes used in month: ");
        int minutes = sc.nextInt();

        double totalBill = 199; // base charge

        if (minutes <= 100) 
		{
            totalBill = 199;
        }
		else if(minutes <= 300) 
		{
            totalBill += (minutes - 100) * 1.0;  // 101–300 mins → ₹1 per min
        } 
		else if(minutes <= 500)
		{
            totalBill += (200 * 1.0) + (minutes - 300) * 1.5; // 101–300 @₹1 + rest @₹1.5
        } 
		else 
		{
            totalBill += (200 * 1.0) + (200 * 1.5) + (minutes - 500) * 2.0; // 101–300 @₹1 + 301–500 @₹1.5 + rest @₹2
        }

        System.out.println("Total monthly bill: Rs. " + totalBill);

     
    }
}
