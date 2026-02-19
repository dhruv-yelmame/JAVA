/*16. Remove Duplicates from ArrayList using Set
Problem Statement:
Remove duplicate elements from ArrayList.
Input:
[10,20,10,30,20]
Output:
[10,20,30]
Explanation:
Convert list into LinkedHashSet to preserve order.
*/

import java.util.*;
public class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter elements: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0; i<al.size(); i++)
		{
			set.add(al.get(i));
		}
		
		System.out.print(set);
	}
}