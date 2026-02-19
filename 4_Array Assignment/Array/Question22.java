/*Q2.Write a java program count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        sum = 6
	Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/

import java.util.*;
public class Question22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[]{1, 5, 7, -1, 5};
		int i,j;
		int count=0;
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==6)
				{
					System.out.println("("+(a[i]+","+a[j])+")");
					count++;
				}
			}	
		}
		System.out.println("Total pairs = " + count);
	}
}