//Q19. Write a java program to find the sum of the first and last digit of a number.



import java.util.*;
public class Q19
{
	public static int show(int n)
	{
		if(n<10)
			return n;
		return show(n/10);
	
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int last=n%10;
		int res = show(n);
		System.out.print("Sum of First and Last Digit: "+(res+last));
	}
}