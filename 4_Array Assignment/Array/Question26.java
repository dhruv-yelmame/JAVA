/*Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]
*/


public class Question26
{
	public static void main(String x[])
	{
		int a[] = new int[]{3, 6, 7, 9, 10};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%3==0)
			{
				a[i]=-1;
			}
			System.out.print(a[i]+" ");
		}
	
	}
}