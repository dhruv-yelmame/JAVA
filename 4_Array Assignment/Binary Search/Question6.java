/* Q6. Problem: Perform binary search to find the index of a given key in a sorted array.
 If the key is not found, print -1.
Example: Input:
 arr = {2, 4, 6, 8, 10, 12}
 key = 10
 Output: Index = 4
Logic Explanation:
Set low = 0, high = arr.length - 1.
Find mid = (low + high) / 2.
If arr[mid] == key, element found.
If arr[mid] < key, search right half.
Else, search left half.
*/

import java.util.*;
public class Question6
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
		int skey = sc.nextInt();
		
		int left=0, right=a.length-1;
		int index=-1;
		while(left<=right)
		{
		     	int mid = (left+right)/2;
				if(a[mid]==skey)
				{
					index=mid;
					break;
				}
				else if(a[mid]<skey)
				{
					left = mid + 1;
				}
				else
				{
					right = mid - 1;
				}
		}
		
		if(index!=-1)
		{
			System.out.print("Index = "+index);
		}
		else
		{
			System.out.print("key is not found");
		}
	}
}