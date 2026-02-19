/*Q46. Write a Java program to display all Twin Primes between 1 and n.
   Twin Primes are pairs of prime numbers that differ by 2.
   Example: (3, 5), (5, 7), (11, 13).
*/

import java.util.*;
public class Example46
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

       
        for(int i=2; i<=n-2; i++)
        {
            // check if i is prime
            int count1 = 0;
            for(int j = 1; j <= i; j++) 
			{
                if(i % j == 0) 
					count1++;
            }

            // check if i+2 is prime
            int count2 = 0;
            for(int j = 1; j <= i+2; j++) 
			{
                if((i+2) % j == 0) 
					count2++;
            }

            // if both are prime
            if(count1 == 2 && count2 == 2)
			{
                System.out.println("(" + i + "," + (i+2) + ")");
            }
        }
    }
}
