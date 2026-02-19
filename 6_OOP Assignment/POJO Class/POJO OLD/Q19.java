/*Q19. Rearrange an array such that arr[i] = i
Given an array of elements of length n, ranging from 0 to n – 1. 
All elements may not be present in the array.
 If the element is not present then there will be -1 present in the array. 
 Rearrange the array such that arr[i] = i and if i is not present, display -1 at that place.
Examples: 
Input: arr[] = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]
Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
Explanation: In range 0 to 9, all except 0, 5, 7 and 8 are not present. Hence, we print -1 instead of
them.
Input: arr[] = [0, 1, 2, 3, 4, 5] 
Output: [0, 1, 2, 3, 4, 5]
Explanation: In range 0 to 5, all numbers are present.
Your Task: You have to create class name as ReArrange with constructor and methods 
ReArrange(int a[]): this function is used for accept array as parameter
int [] getReArrange(): this function can rearrange all arrays and return it.
*/


import java.util.*;
class ReArrange
{
	private int []a;
	public void setArray(int a[])
	{
		this.a=a;
	}
	
	int[] getReArrange()
	{
		int n=a.length;
		
		int temp[]=new int[n];
		
		for(int i=0; i<n; i++)
		{
			temp[i]=-1;	
		}
		
		for(int i=0; i<n; i++)
		{
			if(a[i]!=-1 && a[i]<n)
			{
				temp[a[i]]=a[i];
			}
		}
		
		return temp;
	}
}

public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.print("enter the element in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		ReArrange ra = new ReArrange();
		ra.setArray(a);
		
		int res [] = ra.getReArrange();
		for(int i=0; i<res.length; i++)
			System.out.print(res[i] + " ");
	}
}