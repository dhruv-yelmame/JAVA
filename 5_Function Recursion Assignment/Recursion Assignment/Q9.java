//Q9. Write a java program to print a multiplication table of any number.



import java.util.*;
public class Q9
{
	public static void show(int i, int n)
	{
		if(i>10)
			return ;
			
		System.out.println(n+" x "+i+" = "+(n*i));
		show(i+1, n);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		show(1, n);
	}
}