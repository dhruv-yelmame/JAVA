//Q23. Write a java program to Check Number Is Duck Number or Not.


import java.util.*;
public class Q23
{

	public static boolean show(int n)
	{
		if(n==0)
			return false;
	
	
		int rem = n%10;
		if(rem==0)
			return true;
		
		
		return show(n/10);
		
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		if (String.valueOf(n).charAt(0) == '0') {
            System.out.println("Not Duck Number");
            return;
        }

		
		if(show(n))
			System.out.print("Duck Number");
		else
			System.out.print("Not Duck Number");
		
	}
}