//Q9. Write a java program to print a multiplication table of any number.


import java.util.*;
public class Question9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();
		
		int tab;
		int i=1;
		do
		{
			tab = n * i;
			System.out.println(n+"x"+i+"="+tab);
			i++;
		}while(i<=10);
		
	}
}