/*6. Remove All Null Values from ArrayList
Problem Statement:
Write a Java program to remove all null elements from an ArrayList.
Input:
[10, null, 20, null, 30]
Output:
[10, 20, 30]
Explanation:
Use removeAll(Collections.singleton(null)).
*/

import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
        al.add(null);
        al.add(20);
        al.add(null);
        al.add(30);
		
		Iterator<Integer> i = al.iterator();
		while(i.hasNext())
		{
			if(i.next() == null)
			{
				i.remove();
			}	
		}
		
		System.out.print(al);
	}
}