/*1. Maximum Sum Subarray of Size K
Example:
Input: arr = [2, 1, 5, 1, 3, 2], K=3
Output: 9 (subarray [5, 1, 3])
*/


public class Q1
{
	public static void main(String x[])
	{
		
		int a[] = new int[]{2,  1, 5, 1, 3, 2};
		int k=3;
		int sum=0, max;
		int start=0,end=0;
		for(int i=0; i<k; i++)
		{
			sum+=a[i];
		}
		max=sum;
		for(int i=k; i<a.length; i++)
		{
			sum+=a[i]-a[i-k];
			if(sum>max)
			{
				max=sum;
				start=i-k+1;
				end=i;
			}
		}
		System.out.print("Sum of max subarray: "+max);
		System.out.print("[");
		for(int i=start; i<=end; i++)
		{
			System.out.print(a[i]);
			if(i<end) System.out.print(", ");
		}
		System.out.print("]");
	}
}