/*Q5. Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 			
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321			
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11	
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135				
Case 5 : Store only prime number at the same index of digit.
		Output :- 2573  5  253  25  357  235
*/


import java.util.*;
public class Question40
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[a.length];
		System.out.print("enter the values of array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		System.out.print("Case 1 : Sort Number In Ascending Order.");
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(b[i]>b[j])
				{
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}

		
		
		
	}
}
