/*Q12. WAP to create class name as Rev with two functions 
void setValue(int …x): this function can accept infinite values from calling 
void rev(): this function can reverse the array and display it
*/

import java.util.*;
class Rev
{
	private int []a;
	public void setValue(int ...x)
	{
		this.a=x;
	}
	
	public void rev()
	{
		int start=0, end=a.length-1;
		for(int i=0; i<a.length/2; i++)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		System.out.print("After Reverse:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("enter the elements in array: ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
		
		Rev r = new Rev();
		r.setValue(a);
		r.rev();
		
	}
}