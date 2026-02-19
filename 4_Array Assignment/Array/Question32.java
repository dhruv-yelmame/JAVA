/*Q7. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.
*/


public class Question32
{
	public static void main(String x[])
	{
		int a[] = new int[]{3, 4, 5};
		
		for(int i=0; i<a.length; i++)
		{
			int fact=1;
			for(int j=1; j<=a[i]; j++)
			{
				fact=fact*j;
			}

			a[i] = fact;  
		}
		System.out.print("New Array: ");
		for (int i=0; i<a.length; i++) 
		{
            System.out.print(a[i]+" ");
        }

	}
}
