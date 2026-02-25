/*21. Find Kth Largest Element using TreeSet
Problem Statement:
Find Kth largest element.
Input:
10 20 30 40 50
K = 2
Output:
2nd Largest = 40
Explanation:
Use descending iterator.
*/

import java.util.*;
public class Q21
{
	public static void main(String x[])
	{
		int a[] = {10, 20, 30, 40, 50};
		
		TreeSet<Integer> set = new TreeSet<>();
		
		int k=2;
		
		for(int num : a)
		{
			set.add(num);
		}
		
		Iterator<Integer> i = set.descendingIterator();
		
		int count=0;
		int result=-1;
		
		while(i.hasNext())
		{
			int value = i.next();
			count++;
			if(count == k)
			{
				result=value;
				break;
			}
		}
		
		if(result != -1)
			System.out.println("Kth Largest: "+result);
		else
			System.out.println("Element does not found");
		
	}
}