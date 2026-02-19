/*Q3. Write a program in java to rotate an array by N positions ?
	Expected Output:
	The given array is: 0  3  6  9  12  14  18  20  22  25  27
	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:
	12 14 18 20 22 25 27 0 3 6 9
*/


import java.util.*;
public class Question18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i, j;
		System.out.println("enter the values of array: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the position: ");
		int index = sc.nextInt();
		
		int temp[] = new int[a.length];
        int count = 0;
		for(i=index; i<a.length; i++)
        {
            temp[count++] = a[i];//12 14 18 20 22 25 27
        }
		System.out.print("Before " +index+ " position the values of the array are: ");
		for(i=0; i<index; i++)
		{
			System.out.print(a[i]+" ");//0 3 6 9 
		}
		for(i=0; i<index; i++)
        {
            temp[count++] = a[i];//12 14 18 20 22 25 27 0 3 6 9
        }
		for(i=0; i<a.length; i++)
        {
            a[i] = temp[i];//12 14 18 20 22 25 27 0 3 6 9
        }
		
		System.out.println();
		System.out.print("After rotating from " +index+ " position the array is: ");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}