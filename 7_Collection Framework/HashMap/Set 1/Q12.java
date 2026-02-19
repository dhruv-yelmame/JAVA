/*12. Check Element Exists in Set
Problem Statement:
Check whether a given number exists in HashSet.
Input:
Set = [10,20,30]
Check = 20
Output:
Element Found
Explanation:
Use set.contains().
*/

import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		
		if(set.contains(20))
			System.out.println("Element Found");
		else
			System.out.println("Element Not Found");
	}
}