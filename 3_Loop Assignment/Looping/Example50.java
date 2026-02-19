/*Q50. Task: Identify the first digit in a number that does not repeat anywhere else, using only loops.
Example: n = 1213451 → first non-repeating digit = 2.
*/


import java.util.Scanner;
public class Example50 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();//1213451
        int temp = n;

        // Find the divisor to get the leftmost digit first
        int divisor = 1;
        while (temp/divisor>=10) 
		{
            divisor *= 10;
        }
		
        boolean found = false;

        // Loop through digits from left to right
        while (divisor>0) 
		{
            int digit = temp/divisor; // extract leftmost digit
            int checker = n;
            int count = 0;

            // Count occurrences of this digit
            while (checker != 0) 
			{
                if (checker % 10 == digit) 
				{
                    count++;
                }
                checker /= 10;
            }

            if (count==1)				
			{ // first non-repeating digit found
                System.out.println("First non-repeating digit: " + digit);
                found = true;
                break;
            }

            temp %= divisor; // remove leftmost digit
            divisor /= 10;   // move to next digit
        }

        if (!found) {
            System.out.println("No non-repeating digit found.");
        }
    }
}
