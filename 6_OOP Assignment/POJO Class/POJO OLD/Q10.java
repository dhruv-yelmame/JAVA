/*Q10. WAP to create class name as FindMax with two functions 
void setValue(int …x): this function accept infinite parameter from calling
int  getMax(): this function can find the value from the function and return it.
*/

import java.util.*;
class FindMax
{
	private int []a;
	public void setValue(int ...x)
	{
		this.a=x;
	}
	
	public int getMax()
	{
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}

public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
		
		FindMax fm = new FindMax();
		fm.setValue(a);
		int res = fm.getMax();
		System.out.print("Maximum Element: "+res);
	}
}