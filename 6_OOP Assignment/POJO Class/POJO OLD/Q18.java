/*Q18.Median of two Sorted Arrays of Different Sizes
Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays.
Assume that the two sorted arrays are merged and then median is selected from the combined
array.
Examples: 
Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10]
Output: 3
Explanation: The merged array is [-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15]. 
So the median of the merged array is 3.
Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45, 60]
Output: The median is 11.
Explanation : The merged array is [1, 2, 12, 13, 15, 17, 26, 30, 38, 45, 60]. 
So the median of the merged array is 17.

Input: a[] = [], b[] = [2, 4, 5, 6]
Output: The median is 4.5
Explanation: The merged array is [2, 4, 5, 6]. The total number of elements are even,
 so there are two middle elements. Take the average between the two: (4 + 5) / 2 = 4.5
Your Task : you have to create class name as Median with constructor and some methods
given below 
Median(int a[],int b[]): this constructor help us to accept two array as parameter 
float getMedian(): this function can find the median of an array and return its result.
*/


import java.util.*;
class Median
{
	private int []a;
	private int []b;
	public void setArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	
	public float getMedian()
	{
		int c[] = new int[a.length+b.length];
		int k=0;
		for(int i=0; i<a.length; i++)
			c[k++]=a[i];
		
		for(int i=0; i<b.length; i++)
			c[k++]=b[i];
			
		for(int i=0; i<c.length; i++)
		{
			for(int j=i+1; j<c.length; j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		int n = c.length;

		//odd length
        if(n%2!=0)
            return c[n/2];
        
		//even length
        return (c[n/2] + c[n/2 - 1]) / 2.0f;
	}
}

public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[0];
		int b[] = new int[4];
		System.out.print("enter the elements in array 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("enter the elements in array 2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		Median m = new Median();
		m.setArray(a,b);
		float res = m.getMedian();
		System.out.print("Median: "+res);
	}
}