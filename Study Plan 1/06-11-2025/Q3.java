/*3. Find the Frequency of a Specific Element
Concept: Count how many times a given value appears in the array.
 Use Case: Count votes, survey results, repeated entries.
Input:  arr = [4, 5, 6, 4, 7, 4, 8]
Target element = 4
Frequency of element 4 is: 3
*/


import java.util.*;
public class Q3
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of arr: ");
        int size = sc.nextInt();
        
        int a[] = new int[size];
        
        System.out.print("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        
		System.out.print("enter the target element: ");
		int target = sc.nextInt();
		
		int count=0;
        for(int i=0; i<size; i++)
		{
			if(a[i]==target)
			{
				count++;
			}
		}
		
		System.out.print("Frequency of element "+target+" is: "+count);
    }
}

