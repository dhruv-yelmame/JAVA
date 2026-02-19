/*Q1. WAP to create class name as Table with functions 
 void setValue():  this function is used for accept the number as input parameter 
 void showTable(): this function can display the table of numbers.
*/

import java.util.*;
class Table
{
	private int n;
	public void setValue(int n)
	{
		this.n=n;
	}
	
	public void showTable()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}
}

public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Table t = new Table();
		t.setValue(n);
		t.showTable();
	}
}