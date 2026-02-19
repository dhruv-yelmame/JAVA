/*Q55. Write a java program to display following series :
           	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
*/

public class Example55
{
	public static void main(String x[])
	{
		for(int i=1; i<=8; i++)
		{
			System.out.print((5*i)+" ");
			
				if(i==8)
				break;
				
			System.out.print((3*i)+" ");
		}
	}
}