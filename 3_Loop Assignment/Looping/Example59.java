/*Q59. Write a Java program to display the following series: 
100   81   64   49   36   25   16   9   4   1 
(Perfect squares in reverse order)
*/

public class Example59
{
	public static void main(String x[])
	{
		for(int i=10; i>=1; i--)
		{
			System.out.print((i*i)+" ");
		}
	}
}