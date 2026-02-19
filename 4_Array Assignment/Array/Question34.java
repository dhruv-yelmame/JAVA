/*Q9. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, find sum of divisors and compare with the number, then count.
*/

public class Question34
{
	public static void main(String x[])
	{
		int a[] = new int[]{6, 28, 10, 12, 496};
		int c=0;
		System.out.print("All Perfect Number = ");
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			for(int j=1; j<a[i]; j++)
			{
				if(a[i]%j==0)
				{
					sum+=j;
				}
			}
			
			if(sum==a[i])
			{
				System.out.print(a[i]+" ");
				c++;
			}
		}
		
		System.out.println();
		System.out.print("Count of Perfect numbers = "+c);
	}
}