/*Question 2:
Given a sorted array rotated at some pivot (like [6, 7, 1, 2, 3, 4, 5]), search for a number x using binary search.
Example:
 arr = [6, 7, 1, 2, 3, 4, 5], x = 3
 Output: Found at index 4
*/

import java.util.*;
public class Question2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int left=0, right=a.length-1, mid, index=-1;

		System.out.print("enter the values in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();//6, 7, 1, 2, 3, 4, 5
		}
		System.out.print("enter the element for search in array: ");
		int skey = sc.nextInt();//3
		
		 while(left<=right)//0<=6, 4<=6, 4<=3
		 { 
			mid=left+(right-left)/2;//3, 5
	        if(a[mid]==skey)//2=3-f, 4=3-f
			{  
				index=mid;
				break;
			}
			else if(a[mid]<skey)//2<3-t, 4<3-f
			{ 
				left=mid+1;//3+1=4
			}
			else
			{
				 right=mid-1;//4-1=3
			}
			
		 }
		 if(index!=-1)//4!=-1-t
		 { 
			System.out.println("Found at index "+index);
		 }
		 else
		 {
			  System.out.println("Not Found");
		 }

		
		
	}
}