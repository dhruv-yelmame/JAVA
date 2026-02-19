/*10. Average of All Subarrays of Size K
Example:
 Input: arr = [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 Output: [2.2, 2.8, 2.4, 3.6, 2.8]
*/


import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ente the size of arr: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("ente the elements in arr: ");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=5;
		int sum=0;
		float avg;
		for(int i=0; i<k; i++)
		{
			sum+=a[i];
		}
		avg = (float)sum/k;
		System.out.print("Average of subarray: "+avg+" ");
		
		for(int i=k; i<a.length; i++)
		{
			sum+=a[i]-a[i-k];
			avg = (float)sum/k;
			System.out.print(avg+" ");
		}
		
		
	}
}