/*4. Sort ArrayList in Ascending Order
Problem Statement:
Write a Java program to store integers in an ArrayList and sort them in ascending order.
Input: ArrayList = [50, 10, 40, 20]
Output: Sorted List = [10, 20, 40, 50]
Explanation:
Use Collections.sort().
*/

import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter element: ");
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		System.out.println("Before Sorting: "+al);
		
		for(int i=0; i<al.size(); i++)
		{
			for(int j=i+1; j<al.size(); j++)
			{
				if(al.get(i) > al.get(j))
				{
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		
		System.out.println("After Sorting: "+al);
	}
}