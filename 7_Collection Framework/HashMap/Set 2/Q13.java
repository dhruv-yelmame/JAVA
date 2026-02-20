/*13. Remove Elements Greater than Average using ArrayList
Problem Statement:
Remove all numbers greater than average from ArrayList.
Input:
[10,20,30,40,50]
Output:
[10,20,30]
Explanation:
Find average → remove using iterator.
*/

import java.util.*;
public class Q13
{
	public static void main(String x[])
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		int sum=0;
		
		for(int i=0; i<al.size(); i++)
			sum = sum + al.get(i);
		
		double average = (double)sum/al.size();
		
		Iterator<Integer> i = al.iterator();
		
		while(i.hasNext())
		{
			int value = i.next();
			
			if(value > average)
				i.remove();
		}
		
		System.out.print(al);
	}
}