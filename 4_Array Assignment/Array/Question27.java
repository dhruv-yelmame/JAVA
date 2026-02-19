/*Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]
*/

public class Question27
{
	public static void main(String x[])
	{
		int a[] = new int[]{5, 3, 7, 2};
		
			a[0]=0;
			a[a.length-1]=0;
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}