//Q9. Write a java program to print a multiplication table of any number.



import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getTable(n);	
	
	}
	
	public static int getTable(int n)
	{
		int tab=1;
		for(int i=1; i<=10; i++)
		{
			tab = i*n;
			System.out.println(i+" x "+n+" = "+tab);
		}
		return tab;
		
	}
}