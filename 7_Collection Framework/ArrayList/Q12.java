/*Q2. Write a java program to remove all odd number from an arraylist.*/

import java.util.*;
public class Q12
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
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)%2!=0)
			{
				al.remove(i);
				i--;
			}
		}
		
		System.out.print("New List: "+al);
	}
}
