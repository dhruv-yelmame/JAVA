/*Q3. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]
*/

public class Question28
{
	public static void main(String x[])
	{
		int a[] = new int[]{10, 12, 15, 17, 20};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%5==0)
			{
				a[i]=5;
			}
			System.out.print(a[i]+" ");
		}
	}
}