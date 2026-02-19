//Q12. Write a java program to calculate the product of digits in a number.



import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int pro = getProduct(n);	
		System.out.print("Product of Digit: "+pro);
	}
	
	public static int getProduct(int n)
	{
		int p=1;
		while(n!=0)
		{
			int rem = n%10;
			p*=rem;
			n=n/10;
		}
		return p;
	}
}