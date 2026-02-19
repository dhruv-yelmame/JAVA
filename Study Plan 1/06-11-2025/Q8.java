/*8 Reverse an Array
Idea: Use two pointers, one at the start and one at the end, swap elements and move inward.
Example:
 arr = [1, 2, 3, 4, 5] → after reversal → [5, 4, 3, 2, 1]
*/

import java.util.*;
public class Q8
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
		
		 int start=0, end=size- 1;
			while(start<end)
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
    }
}

