/*Q34. Write a java program to find the frequency of each digit in a given integer.
*/

import java.util.*;
public class Example34 
{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp, count;

        System.out.println("Digit frequencies in " + n + " are:");

        //check each digit 0–9
        for (int d = 0; d <= 9; d++)
			{
            temp = n;
            count = 0;

            // count occurrences of digit d
            while (temp > 0) {
                int rem = temp % 10;
                if (rem == d) 
				{
                    count++;
                }
                temp /= 10;
            }

            if (count > 0) {
                System.out.println(d + " -> " + count);
            }
        }
    }
}
