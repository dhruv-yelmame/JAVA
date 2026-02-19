/*4. Count Distinct Elements in Every Window of Size K
Example:
Input: arr = [1, 2, 1, 3, 4, 2, 3], K=4
Output: [3, 4, 4, 3]
*/

public class Q4
{
	public static void main(String x[])
	{
		int a[] = new int[]{1, 2, 1, 3, 4, 2, 3};
		int k=4;
		int count=0;
		int i,j;
		for(i=0; i<=a.length-k; i++)//
		{
			count=0;
			for(j=i; j<i+k; j++)
			{
				boolean flag = true;
				for(int p=i; p<j; p++)
				{
					if(a[j]==a[p])
					{
						flag=false;
						break;
					}
				}
				if(flag)
				{
					count++;
				}
			}
			System.out.print(count+" ");
		}
		
		
	}
}