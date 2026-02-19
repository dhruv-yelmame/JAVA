/*Q5. Write a Java program to sort a given array in ascending & descending order.
	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
				Descending Order: [34, 12, 9, 5, 1]
*/


import java.util.*;
public class Question20
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
		System.out.print("The given array is :");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order :");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		  for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) 
				{ // Change comparison for descending
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		System.out.print("Descending Order :");
        for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
  

	}
}