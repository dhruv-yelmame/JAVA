/*Q47. Write a Java program to check whether a given number is a Krishnamurthy Number and list all Krishnamurthy numbers up to n.
A Krishnamurthy number is a number whose sum of the factorials of its digits equals the number itself.
Example: 145 → 1! + 4! + 5! = 145.
*/

import java.util.*;
public class Example47
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//145
		
        for(int i=1; i<=n; i++)
        {
            int temp = i;
            int sum = 0;

            while(temp>0)//145>0 
			{
                int rem = temp%10; //5 , 4 , 1
                int fact = 1;

                // factorial of digit
                for(int j=1; j<=rem; j++) 
				{
                    fact = fact * j;//1*1-1*2-2*3-6*4-24*5-120, 4*3*2*1-24, 1
                }

                sum = sum + fact;//0+120-120+24+1=145
                temp = temp / 10; //14, 1, 0
            }

            if(sum==i) 
			{
                System.out.println(i);
            }
        }
	}
}