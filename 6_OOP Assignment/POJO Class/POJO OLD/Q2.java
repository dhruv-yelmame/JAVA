/*Q2. WAP to create class name as Power with function 
  void setNum(): this function accept two values first is base and second is index 
  void showPower(): this function can calculate the power of two numbers and display it.
*/

import java.util.*;
class Power
{
	private int base;
	private int index;
	public void setNum(int base, int index)
	{
		this.base=base;
		this.index=index;
	}
	
	public int showPower()
	{
		int p=1;
		for(int i=1; i<=index; i++)
		{
			p=p*base;
		}
		return p;
	}
}

public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the base: ");
		int base = sc.nextInt();
		System.out.print("enter the index: ");
		int index = sc.nextInt();
		
		Power p = new Power();
		p.setNum(base,index);
		int res = p.showPower();
		System.out.print("Power: "+res);
	}
}