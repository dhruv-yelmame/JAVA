/*3.Count Even and Odd Numbers in an Array
 Write a class to implement a method to count how many numbers are even and odd in an integer array.
 Explanation: Learn conditional checks and iteration in arrays.
*/

import java.util.*;
class EvenOddArray
{
	public void show(int a[])
	{
		int ec=0, oc=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				ec++;
			else
				oc++;
		}
		System.out.print("Even Count: "+ec+"\t"+"Odd Count: "+oc);
	}
}

public class Q23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.print("enter the elements in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		EvenOddArray eo = new EvenOddArray();
		eo.show(a);
	}
}