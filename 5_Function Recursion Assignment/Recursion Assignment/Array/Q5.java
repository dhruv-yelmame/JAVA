/*Q5. Write a Java program that finds the sum of even and odd elements in an array using functions.
Example Input:
arr = {10, 15, 8, 7, 9, 12}
Output:
Sum of Even: 30  
Sum of Odd: 31
*/



import java.util.*;
public class Q5
{
	public static void show(int a[], int index, int sumEven, int sumOdd)
	{		
		if(index==a.length)
		{
			System.out.println("Sum of Even: "+sumEven);
			System.out.println("Sum of Odd: "+sumOdd);
			return;
		}
		
		if(a[index]%2==0)
		{
			sumEven+=a[index];
		}
		else
		{
			sumOdd+=a[index];
		}
		show(a,  index+1, sumEven, sumOdd);
	}
		
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
	
		System.out.print("enter the values in array 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
	
		show(a, 0, 0, 0);
			
		
	}
}