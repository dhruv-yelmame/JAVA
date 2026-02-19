/*22. Find Union of Two Sets
Problem Statement:
Find union of two HashSet.
Input:
Set1 = [1,2,3]
Set2 = [3,4,5]
Output:
Union = [1,2,3,4,5]
Explanation:
Use addAll().
*/

import java.util.*;
public class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		set1.addAll(set2);
		System.out.println("Union: "+set1);
	}
}