/*Q58. Write a Java program to display the following series:
2 6 12 20 30 42 56 72 90 110
(n(n+1) pattern multiplied by 2)*
*/

public class Example58
{
	public static void main(String x[])
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print((i*(i+1))+" ");
		}
	}
}