//Q38. Write a java program to find all prime factors of a number.

import java.util.*;
public class Example38 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; ) 
		{
            if (n % i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
            else 
            {
                i++;
            }
        }
    }
}
