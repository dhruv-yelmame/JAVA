//Q5. Write a java program to find the minimum between two numbers.



import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		if(a<b)
			System.out.print("First is Minimum");
		else
			System.out.print("Second is Minimum");
	}
}