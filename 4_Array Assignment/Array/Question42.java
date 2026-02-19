/*Q7. Write a java program to merge two arrays.
	Input - First Array :- 1 2 3 4 5
            Second Array :-  6 7 8 9 10 
	Output - 1 10 2 9 3 8 4 7 5 6
*/


public class Question42
{
	public static void main(String x[])
	{
		int a[] = new int[]{1, 2, 3, 4, 5};
		int b[] = new int[]{6, 7, 8, 9, 10};
		int c[] = new int[a.length+b.length];
		int i,j,k=0;
		for(i=0, j=b.length-1; i<a.length; i++, j--)
		{
			c[k++]=a[i];
			c[k++]=b[j];
		}
		    
		for(i=0; i<c.length; i++)
		{ 
			System.out.print(c[i]+" ");
		} 
	}
}