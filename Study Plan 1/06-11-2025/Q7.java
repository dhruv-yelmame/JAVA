/*7. Find Peak Element
Concept: A peak is greater than its neighbors. Traverse and check this condition.
 Use Case: Find local maximum in signal processing or profit tracking.
Input: arr = [1, 3, 20, 4, 1, 0]
Output: Peak element found: 20 
Examples using Two pointer approach 
*/

///wrong///
///wrong///
///wrong///
///wrong///
///wrong///
import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ente the size of arr: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("ente the elements in arr: ");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
		}
		
		System.out.print("Peak element found: "+max);
	}
}