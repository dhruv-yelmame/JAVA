/*Q60. Write a Java program to display the following series: 
3   6   12   24   48   96  192 
(Each term doubles from the previous term starting at 3)
*/

public class Example60
{
	public static void main(String x[])
	{
		int n =3;
		System.out.print(n+" ");
		
		for(int i=1; i<=6; i++)
		{
			n = n * 2;
			System.out.print(n+" ");
		}
	}
}