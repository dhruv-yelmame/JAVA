 /*Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, 
that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
*/

import java.util.*;
public class Example27 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum, rem;

        while (n!=1 && n!=4) 
		{ 
            sum = 0;
            // find sum of squares of digits
            while(n>0) 
			{
                rem = n%10;
                sum = sum+(rem*rem);
                n = n/10;
            }
            n = sum;  // update n with sum
        }

        if(n==1) 
		{
            System.out.println("Happy Number");
        } 
		else 
		{
            System.out.println("Not Happy Number");
        }
    }
}
