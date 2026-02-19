// Q2. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.


import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age: ");
		int age = sc.nextInt();
		
		if(age>=18)
			System.out.print("Eligible to Vote");
		else
			System.out.print("Not Eligible to Vote");
	}
}