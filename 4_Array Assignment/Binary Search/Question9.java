/*Q9. Problem: Given a sorted array, count how many times a given key occurs using binary search.
Example: Input: arr = {2, 4, 4, 4, 6, 8}, key = 4
 Output: Count = 3
Logic Explanation:
Use binary search twice —
1. To find the first occurrence of the key.
2. To find the last occurrence.
The count = lastIndex - firstIndex + 1.
*/

import java.util.*;
public class Question9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the values in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the search key: ");
		int key = sc.nextInt();
		int count=0;
		int left=0, right=a.length-1, firstIndex=-1, lastIndex=-1;
	
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(a[mid]==key)
			{
				firstIndex = mid;
				right = mid - 1;
			}
			else if(a[mid]<key)
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		
		left=0;
		right=a.length-1;
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(a[mid]==key)
			{
				lastIndex = mid;
				left = mid + 1;
			}
			else if(a[mid]>key)
			{
				right = mid - 1;	
			}
			else
			{
				left = mid + 1;
			}
		}
		
		System.out.println("Count ="+(lastIndex - firstIndex + 1));
	}
}