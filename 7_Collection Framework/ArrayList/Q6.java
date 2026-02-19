/*Q6. Write a java program to Check whether a given number exists in an ArrayList.*/

import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		boolean flag = false;
		System.out.print("enter a number: ");
		int number = sc.nextInt();
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)==number)
			{
				flag=true;
				break;
			}
		}
		
		if(flag)
			System.out.println("Number Found");
		else
			System.out.println("Number Not Found");
	}
}
