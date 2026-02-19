/*Q41. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.
*/

import java.util.*;
public class Example41
{
	public static void main(String x[])
	{
		 Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int temp=n;
        int max=0, min=9;
        while(temp!=0)
        {
            int rem=temp%10;
            if(rem>max)
            {
                max=rem;
            }
            if(rem<min)
            {
                min=rem;
            }
            temp /=10;
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
		
	}
}