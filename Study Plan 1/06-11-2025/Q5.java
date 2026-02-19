/*5. Find Majority Element (Occurs > n/2 Times)
Concept: Use count method or Boyer-Moore Voting Algorithm.
 Use Case: Identify the dominating product, preference, etc.
Inut : arr = [2, 2, 1, 1, 2, 2, 2]
Size (n) = 7
Majority element is: 2
*/


import java.util.*;
public class Q5
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
        
		int majoratyCount=size/2;
		int majoratyElement=0;
		boolean found = false;
        for(int i=0; i<size; i++)
		{
			int count=0;
			for(int j=0; j<size; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					majoratyElement=a[i];
				}
				
				if(count>majoratyCount)
				{
					majoratyElement=a[i];
					found = true;
					break;
				}
			
			}
		}
		
		if(found)
		{
			System.out.print("Majority element is: "+majoratyElement);
		}
		else
		{
			System.out.print("No Majority element");
		}
		
		
    }
}

