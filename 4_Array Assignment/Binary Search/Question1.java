/*Q1. Question: Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example:
 arr = [2, 4, 4, 4, 6, 7, 9], x = 4
 Output: First = 1, Last = 3
*/


public class Question1
{
	public static void main(String x[])
	{
		int a[] = new int[]{2, 4, 4, 4, 6, 7, 9};
		int index=4;
		int left=0, right=a.length-1;
		int first=0, last=0;
		
		while(left<=right)//
		{
			int mid = (left+right)/2;
			if(a[mid]==index)
			{
				first = mid;
				right = mid - 1;
			}
			else if(a[mid]<index)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		
		left=0; right=a.length-1;
		
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(a[mid]==index)
			{
				last = mid;
				left = mid + 1;
			}
			else if(a[mid]<index)
			{
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		
		System.out.println("First="+first+" , "+"Last="+last);
		
		
	}
}