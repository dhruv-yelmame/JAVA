//Q15. Write a java program to print all ASCII characters with their values.



public class Q15
{
	public static void show(char ch, int n)
	{
		if(ch>255)
			return;
		
		System.out.println(n+"-->"+ch);
		n++;
		show((char)(ch+1), n);
	}

	public static void main(String x[])
	{
		show((char)1, 1);
	}
}