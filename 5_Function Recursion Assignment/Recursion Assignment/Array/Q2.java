/* Q2. Write a Java program to count the frequency of each element in an array using a function.
Example Input:
arr = {1, 2, 2, 3, 1, 4, 2}
Output:
1 → 2 times  
2 → 3 times  
3 → 1 time  
4 → 1 time
*/


import java.util.*;
public class Q2
{
		
	public static int show(int a[], int index, int count)
	{	
		if(index==a.length)
			return count;
		
		for(int k=index; k<a.length; k++)
		{
			if(a[index]==a[k])
			{
				count++;
			}
		}
	
		System.out.println(a[index]+"-->"+count+" times");
		return show(a, index+1, 0);
	}
		

	
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
		
		show(a, 0, 0);
	}
}