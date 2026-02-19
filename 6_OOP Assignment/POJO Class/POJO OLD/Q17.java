/*Q17. Search for a pair with a given sum in an array.
Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of
elements in the array whose sum is equal to target. This problem is a variation of 2Sum problem.
Examples: 
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: There is no pair with sum equals to given target.
*/

import java.util.*;
class ArraySum
{
	private int []a;
	private int target;
	public void setArray(int a[], int target)
	{
		this.a=a;
		this.target=target;
	}
	
	public boolean getSum()
	{
		
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==target)
				{
					return true;
				}
			}
		}
		return false;
	}
}

public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the elements in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the target for sum: ");
		int target = sc.nextInt();
		
		ArraySum as = new ArraySum();
		as.setArray(a,target);
		boolean res = as.getSum();
		if(res)
			System.out.print("true");
		else
			System.out.print("false");
		
	}
}
