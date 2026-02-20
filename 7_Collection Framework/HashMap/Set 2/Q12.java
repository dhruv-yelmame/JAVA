/*12. Find Pair with Given Sum using HashSet
Problem Statement:
Find all pairs whose sum equals target.
Input:
Array = 1 4 5 6 3 2
Target = 7
Output:
Pairs = (1,6) (4,3) (5,2)
Explanation:
Use HashSet for checking complement.
*/

import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1, 4, 5, 6, 3, 2};
		int target = 7;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			int complement = target - a[i];
			
			if(set.contains(complement))
			{
				System.out.println(complement+","+a[i]);
			}
			
			set.add(a[i]);
		}
	}
}