//Q21. Write a java program to check Number Is Prime Number or Not

import java.util.*;

public class Example21
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1, count = 0;

        while (i <= n) 
		{
            if (n % i == 0) 
			{
                count++;
            }
            i++;
        }

        if (count==2) 
		{ 
            System.out.println(n + " is a Prime Number.");
		}
		else
		{
            System.out.println(n + " is Not a Prime Number.");
        }
	}
}
