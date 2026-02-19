/*23. Find Intersection of Two Sets
Problem Statement:
Find intersection of two sets.
Input:
Set1 = [1,2,3]
Set2 = [2,3,4]
Output:
Intersection = [2,3]
Explanation:
Use retainAll().
*/

import java.util.*;
public class Q23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		set1.retainAll(set2);
		System.out.println("Intersection: "+set1);
	}
}