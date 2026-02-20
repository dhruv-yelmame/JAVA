/*15. Rotate ArrayList by K Positions
Problem Statement:
Rotate elements of ArrayList by K positions.
Input:
[1,2,3,4,5]
K = 2
Output:
[4,5,1,2,3]
Explanation:
Use Collections.rotate().
*/


import java.util.*;
public class Q15
{
	public static void main(String x[])
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		int k=2;
		Collections.rotate(al, k);
		System.out.println(al);
	}
}
