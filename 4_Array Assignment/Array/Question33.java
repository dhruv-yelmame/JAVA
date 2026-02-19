/*Q8. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.
*/


public class Question33
{
	public static void main(String x[])
	{
		int a[] = new int[]{2, 5, 6, 9, 11};
		int c=0;
		System.out.print("All Prime Number = ");	
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=1; j<=a[i]; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(a[i]+" ");
				c++;
			}
		}
			
		System.out.println();
		System.out.print("Count of prime numbers = "+c);
	}
}