//Q10. Write a java program to count the number of digits in a number.



import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int c = getCount(n);	
		System.out.print(c);
	}
	
	public static int getCount(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
}