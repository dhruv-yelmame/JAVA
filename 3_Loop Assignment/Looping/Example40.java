/* Q40. Write a Java program to print all automorphic numbers between 1 and n.
   An automorphic number’s square ends with the number itself (e.g., 5² = 25).
*/

import java.util.*;
public class Example40
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) 
		{
            int sq = i * i;
            int temp = i;
            int count = 0;

            
            while(temp>0) 
			{
                count++;
                temp /= 10;
            }

            int divisor = 1;
			
            for(int j = 1; j <= count; j++) {
                divisor *= 10;
            }
			
			int lastDigit = sq % divisor;


            if(lastDigit==i) 
			{
                System.out.print(i + " ");
            }
        }
    }
}
