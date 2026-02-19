//Q5. Write a java program to print all odd numbers between 1 to 100.


public class Q5
{
	public static void show(int i)
	{
		if(i>100)
		 return ;
		
		System.out.print(i+" ");
		show(i+2);
	}
	public static void main(String x[])
	{
		show(1);
	}
}