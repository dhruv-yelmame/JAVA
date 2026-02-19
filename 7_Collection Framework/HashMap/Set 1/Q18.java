/*18. Convert Set to Array
Problem Statement:
Convert a HashSet into an integer array.
Input:
Set = [10,20,30]
Output:
Array = 10 20 30
Explanation:
Use toArray().
*/

import java.util.*;
public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter element: ");
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0; i<4; i++)
		{
			set.add(sc.nextInt());
		}
		System.out.println("Set: "+set);
		Integer temp[] = set.toArray(new Integer[0]);
		int a[] = new int[temp.length];
		
		for(int i=0; i<temp.length; i++)
		{
			a[i]=temp[i];
		}
		System.out.print("Array: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}