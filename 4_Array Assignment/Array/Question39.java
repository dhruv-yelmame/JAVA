/*Q4. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8
*/


public class Question39
{
	public static void main(String x[])
	{
		int a[] = new int[]{7, 9, 5, 6, 13, 2};
		int large=0;
		int i,j;
		int first=a[0], second=a[0];
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[j]-a[i]>large)
				{
					large=a[j]-a[i];
					first = a[i];
                    second = a[j];
				}
			}
		}					
	
		System.out.print("Elements = ");
		System.out.print(first+","+second+" ");
		System.out.println();
		System.out.println("Maximum Difference = "+large);
	}
}