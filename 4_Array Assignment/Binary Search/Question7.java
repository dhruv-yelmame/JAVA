/* Q7. Problem : In a sorted array, use binary search to find the position where a given key should be inserted to maintain order.
Example: Input:
 arr = {1, 3, 5, 6}, key = 2
 Output: Insert Position = 1
Logic Explanation:
Use binary search to find mid.
If key < arr[mid], move high to mid - 1.
If key > arr[mid], move low to mid + 1.
When loop ends, low will be the correct insert position.
*/

import java.util.*;
public class Question7
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
		System.out.print("enter the element: ");
		int key = sc.nextInt();
		
		
		int left=0, right=a.length-1;
		int index=-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			
			if(key>a[mid])
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		
		System.out.print("Insert Position = "+left);
	
	}
}
