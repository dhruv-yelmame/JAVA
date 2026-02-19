//Q3. Write a java program to print all alphabets from a to z. - using while loop


public class Q3
{
	public static void main(String x[])
	{
		char ch='a';
		getAlpha(ch);	
	}
	
	public static void getAlpha(char ch)
	{
		for(int i='a'; i<='z'; i++)
		{
			System.out.print((char)i+" ");
		}

	}
}