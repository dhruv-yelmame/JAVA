/*Q3. Write a java program to Insert a number at a given index in an ArrayList.*/

import java.util.*;
public class Q13
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
		System.out.println("Old List: "+al);
		System.out.print("enter index: ");
		int index = sc.nextInt();
		System.out.print("enter element: ");
		int element = sc.nextInt();
		
		al.add(index,element);
		
		System.out.print("New List: "+al);
	}
}
