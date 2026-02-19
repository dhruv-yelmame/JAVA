/*Q8. Write a java program to display top three value from array.
	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86
*/

public class Question43
{
	public static void main(String x[])
	{
		int a[] = new int[]{78, 90, 90, 86, 85, 92, 70, 92};
		
		int fLarge=a[0], sLarge=a[1], tLarge=a[2];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>fLarge)
			{
				tLarge=sLarge;
				sLarge=fLarge;
				fLarge=a[i];
			}
			else if(a[i]>sLarge && a[i]!=fLarge)
			{
				sLarge=a[i];
			}
			else
			{
				if(a[i]>tLarge && a[i]!=fLarge && a[i]!=sLarge)
				{
					tLarge=a[i];
				}
			}
				
		}
		
		System.out.print(fLarge+" "+sLarge+" "+tLarge+" ");
	}
}