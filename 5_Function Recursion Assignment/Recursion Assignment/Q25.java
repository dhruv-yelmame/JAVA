//Q25. Write a java program to Check Number Is Armstrong Number or Not.


import java.util.*;
public class Q25
{
	public static int power(int base, int index)
	{
		if(index==0)
			return 1;
		
		return base * power(base, index-1);
	}
	
	
    public static int show(int n, int count)
    {
        if (n == 0)
            return 0;
		
		int rem = n%10;
		return power(rem, count) + show(n / 10, count);
			
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		
		int temp=n;
		int count=0;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		
        int sum = show(n, count);

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
