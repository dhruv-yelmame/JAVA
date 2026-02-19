/*Q5. Write a java program to check whether elements of an ArrayList form a palindrome.*/

import java.util.*;
public class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		boolean flag=true;
		int start=0, end = al.size()-1;
		for(int i=0; i<al.size()/2; i++)
		{
			if(al.get(start)!=al.get(end))
			{
				flag=false;
				break;
			}
			start++;
			end--;
		}
		
		if(flag)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}
