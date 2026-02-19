/*4. Find All Pairs with Given Sum
Concept: Use nested loops or two-pointer technique to check sums.
 Use Case: Match contributors, tasks, etc., that add up to a budget.
arr = [1, 5, 7, -1, 5]
Target sum (S) = 6
Example: Pairs with sum 6:
(5, 1)
(-1, 7)
(5, 1)
*/


import java.util.*;
public class Q4
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
        
		System.out.print("enter the target sum: ");
		int target = sc.nextInt();
		
		int count=0;
        for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
		
		
    }
}

