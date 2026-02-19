/*Q9. Write a java program to Copy all elements from one integer ArrayList to another.*/

import java.util.*;
public class Q9
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
		
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		
		for(int i=0; i<al.size(); i++)
		{
			al2.add(al.get(i));
		}
		
		System.out.print("New List: "+al2);
		
	}
}
