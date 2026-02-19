// Q36. Write a java program to find HCF (GCD) of two numbers.

import java.util.*;
public class Example36 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt(); // 48

        System.out.print("Enter second number: ");
        int b = sc.nextInt(); // 18

        
        while(b!=0) //18!=0, 12!=0, 6!=0 , 0!=0-f
		{
            int rem = a % b;//48%18-12, 18%12-6, 12%6-0
            a = b;//18, 12, 6
            b = rem;//12, 6, 0
        }

        System.out.println("HCF = " + a);
    }
}
