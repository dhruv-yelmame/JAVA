/*Q7. Write a program in java to insert an element at desired position from an array.
	Test Data :
	Input the size of array : 6
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to insert : 2
	Value : 200
	Expected Output : The new list is : 1 2 200 3 4 5
*/

import java.util.*;
public class Question12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size+1];
		int i;
		System.out.println("enter the values of array: ");
		for(i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display array before insertion");
		for(i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		System.out.println("enter the index where to insert");
		int index = sc.nextInt();
		
		System.out.println("enter the value");
		int value = sc.nextInt();
		
		for(i=size; i>index; i--)
		{
			a[i]=a[i-1];
		}
		a[index]=value;
		size++;
		System.out.println("Display array after insertion");
		for(i=0; i<size; i++)
		{ 
			System.out.print(a[i]+" ");
		}

	}
}