/*Q11. WAP to create class name as Sort with two functions 
void setValue(int …x): this function can accept infinite value 
void sort(): this function can perform sorting on variable argument array
void display(): this function can display the data of array before sorting and after
sorting 
*/

import java.util.*;
class Sort
{
	private int []a;
	public void setValue(int ...x)
	{
		this.a=x;
	}
	
	public void sort()
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void display()
	{
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("enter the elements in array: ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
		
		Sort s = new Sort();
		s.setValue(a);
		
		
		System.out.print("Display Before: ");
		s.display();
		
		System.out.print("\n");
		s.sort();
		
		System.out.print("Display After: ");
		s.display();
		
	}
}