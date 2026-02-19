/*5. Compare Two ArrayLists
Problem Statement:
Write a Java program to check whether two ArrayList<Integer> are equal or not.
Input:
List1 = [10,20,30]
List2 = [10,20,30]
Output:
Both lists are equal.
Explanation:
Use list1.equals(list2).
*/

import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		System.out.print("enter element in al1: ");
		for(int i=0; i<4; i++)
		{
			al1.add(sc.nextInt());
		}
		System.out.print("enter element in al2: ");
		for(int i=0; i<4; i++)
		{
			al2.add(sc.nextInt());
		}
		
		if(al1.equals(al2))
			System.out.println("Both lists are equal.");
		else
			System.out.println("Both lists are not equal.");
	}
}