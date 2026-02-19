//Q8. Write a java program to find the sum of all odd numbers between 1 to n.



import java.util.*;
public class Q8
{
	public static int show(int i, int n)
	{
		if(i>n)
			return 0;
			
		return i + show(i+2, n);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int res = show(1, n);
		System.out.print("Sum: "+res);
	}
}