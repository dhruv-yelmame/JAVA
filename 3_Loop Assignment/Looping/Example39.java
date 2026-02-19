/* Q39. Write a Java program to check whether a given number is a Harshad number 
   (i.e., divisible by the sum of its digits) for numbers from 1 to n.
*/

import java.util.*;
public class Example39 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt(); 

        for (int i = 1; i <= n; i++) 
		{
            int temp = i;
            int sum = 0;
			
            while(temp!=0) 
			{
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }

            if(i%sum==0) 
			{
                System.out.print(i + " ");
            }
        }
    }
}
