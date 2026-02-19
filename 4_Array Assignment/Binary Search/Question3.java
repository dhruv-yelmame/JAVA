/*Question 3:
 Given an integer n, find its floor square root using binary search.
Example:
 n = 17
 Output: 4 (since 4² = 16 ≤ 17 < 25)
*/


import java.util.*;
public class Question3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number to find its floor square root: ");
		int n = sc.nextInt();
		int left=0 , right=n, mid=0,res=0;
		
		while(left<=right)
		{
			mid=left+(right-left)/2;
			
			if(mid<=n/mid)
			{
				res = mid;
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
			
		}
		
		System.out.print("result: "+res);
	}
}

