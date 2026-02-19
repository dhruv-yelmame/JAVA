//Q15. Write a java program to print all ASCII characters with their values.



public class Q15
{
	public static void main(String x[])
	{
		char ch='a';
		getAscii(ch);	
	}
	
	public static void getAscii(char ch)
	{
		for(int i=1; i<=255; i++)
		{
			System.out.println(i+"--->"+(char)i+" ");
		}

	}
}