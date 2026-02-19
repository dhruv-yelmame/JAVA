/*7. Convert Array to HashSet
Problem Statement:
Convert a given integer array into a HashSet and display elements.
Input:
Array = 5 10 15 5 20
Output:
Set = [5, 10, 15, 20]
Explanation:
Add array elements into HashSet.
*/

import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		int a[] = {5, 10, 15, 5, 20};
		TreeSet set = new TreeSet();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		
		System.out.println(set);
	}
}