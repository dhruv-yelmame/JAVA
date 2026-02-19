/* Q11. Write a java program to calculate the sum of digits in a number. */

import java.util.Scanner;

public class Example11 
{
    public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();   // Input number
        int sum = 0;

        while (n > 0) 
		{
            int digit = n % 10;  // Extract last digit
            sum += digit;        // Add digit to sum
            n /= 10;             // Remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}
