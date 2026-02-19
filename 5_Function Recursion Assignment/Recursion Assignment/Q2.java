//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a recursion


import java.util.*;
public class Q2
{
    public static void show(int n)
	{
		if(n==0)
			return ;
		
		System.out.print(n+" ");//2 1
		show(n-1);//1 0
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//2
		
		show(n);
	}
}