//Q10. Write a java program to count the number of digits in a number.


import java.util.*;
public class Question10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();//1456
		
		int count=0;
		do
		{
			count++;
			n=n/10;
	
		}while(n!=0);
		System.out.print(" "+count);
		
	}
}