/*16. Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing.
*/


import java.util.*;
class MultiplicationTable
{
	public void printTable(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
}

public class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		MultiplicationTable m = new MultiplicationTable();
		m.printTable(n);
	}
}