/*Q6. Write a java program to find the unique value from array.
	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
	All unique elements in the array are: 3, 20, 12, 10 
*/

public class Question41
{
	public static void main(String x[])
	{
		int a[] = new int[]{1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
		int b[] = new int[a.length];
		int i,j;
		
		for(i=0; i<a.length; i++)
		{
			int count=0;
			for(j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
            {
                System.out.print(a[i]+" ");
            }
		}
	}
}