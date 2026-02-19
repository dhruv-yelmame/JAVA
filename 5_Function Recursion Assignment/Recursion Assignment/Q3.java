//Q3. Write a java program to print all alphabets from a to z. - using recurison


public class Q3
{
	public static void show(char ch)
	{
		if(ch>'z')
			return;
		
		System.out.print(ch+" ");
		show((char)(ch+1));
	}

	public static void main(String x[])
	{
		show('a');
	}
}