//Q10. Write a java program to count the number of digits in a number.


import java.util.*;
public class Q10
{
	public static int show(int n)
	{
		if(n==0)
			return 0;
		
		return 1 + show(n/10);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		if (n == 0)
            System.out.println("Count: 1");
		
        else
        {
            int res = show(n);
            System.out.println("Count: "+res);
        }
	}
}