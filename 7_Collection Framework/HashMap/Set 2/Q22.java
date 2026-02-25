/*22. Find Subarray with Maximum Sum using ArrayList
Problem Statement:
Find maximum subarray sum and store subarray elements in ArrayList.
Input:
-2 1 -3 4 -1 2 1 -5 4
Output:
Max Sum = 6
Subarray = [4,-1,2,1]
Explanation:
Use Kadane’s Algorithm.
*/

import java.util.*;
public class Q22
{
	public static void main(String x[])
	{
		int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int sum=a[0];
		int maxSum=a[0];
		
		ArrayList<Integer> al = new ArrayList<>();
		
		int start=0, end=0, tempStart=0;
		
		for(int i=1; i<a.length; i++)
		{
			if(sum + a[i] > a[i])
			{
				sum = sum + a[i];
			}
			else
			{
				sum = a[i];
				tempStart=i;
			}
			
			if(sum > maxSum)
			{
				maxSum=sum;
				start=tempStart;
				end=i;
			}
		}
		
		System.out.println("Max Sum: "+maxSum);
		
		for(int i=start; i<=end; i++)
			al.add(a[i]);
		
		System.out.println("Subarray: "+al);
	}
}