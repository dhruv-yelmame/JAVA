/*24. Store Employee IDs in TreeSet
Problem Statement:
Store employee IDs in TreeSet and display in sorted order.
Input:
IDs = 105, 101, 110, 103
Output:
Sorted IDs = [101,103,105,110]
Explanation:
TreeSet stores elements in sorted order automatically.
*/


import java.util.*;
public class Q24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(105);
		set1.add(101);
		set1.add(110);
		set1.add(103);
		

		System.out.println("Sorted IDs = "+set1);
	}
}