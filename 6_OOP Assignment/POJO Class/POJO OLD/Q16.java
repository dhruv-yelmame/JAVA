/*Q16. Binary search in a sorted array
Your Task
You have to create class name as BinarySearch with two methods 
void setArray(int a[]): this function is used for accept array as parameter 
int getIndex(int key): this function accepts a key for search and return index of search element and returns -1 
when the element is not found and show the element at function calling point using index if index is not -1
*/

import java.util.*;
class BinarySearch
{
	private int []a;
	public void setArray(int a[])
	{
		this.a=a;
	}
	
	public int getIndex(int key)
	{	
		int left=0, right=a.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(a[mid]==key)
			{
				return mid;
			}
			else if(a[mid]<key)
			{
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
		
		return -1;
	}
}

public class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the element in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the element for search: ");
		int key = sc.nextInt();
		
		BinarySearch bs = new BinarySearch();
		bs.setArray(a);
		
		int res = bs.getIndex(key);
		
		if(res!=-1)
		System.out.print("Element: "+res);
		else
		System.out.print("Element Not Found");
	}
}