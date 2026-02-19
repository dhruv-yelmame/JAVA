//Q8. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail


import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the percentage: ");
		int percentage = sc.nextInt();
		
		if(percentage>=40)
			System.out.print("Pass");
		else
			System.out.print("Fail");
		
	}
}