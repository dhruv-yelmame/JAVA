/*Q4. WAP to create  class name as Rev with two functions 
   void setValue(): this function is used for accept number 
   void showRev(): this function is used for reverse the number
*/

import java.util.*;
class Rev
{
	private int n;
	public void setValue(int n)
	{
		this.n=n;
	}
	
	public int showRev()
	{
		int reverse=0;
		while(n!=0)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		return reverse;
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the name: ");
		int n = sc.nextInt();
		
		Rev r = new Rev();
		r.setValue(n);
		int res = r.showRev();
		System.out.print("Reverse Number: "+res);
	}
}