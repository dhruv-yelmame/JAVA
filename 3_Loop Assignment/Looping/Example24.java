/*Q24. Write a java program to Check Number Is Strong Number or Not.*/
//A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
//1!=1*1=1, 2!=2*1=2,3!=3*2*1!=6,145!=1+4*3*2+5*4*3*2=1+24+120=145

import java.util.*;
public class Example24
{
	public static void main(String x[])
	{
		int i=1;
		int n,sum=0;
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		n = sc.nextInt();//145
        int n1=n;
		while(n!=0)//145,14
		{
			int rem = n%10;//4
			
			int	n2=1;
			while(n2<=rem)//4<5
			{   	    
				//logic factorial 
				fact=fact*n2;//1  2 6 24
				n2++;//2 3 4 5
			}
			sum=sum+fact;//0+120=120+24=144
			fact=1;
			
			n=n/10;//1
		}

			if(n1==sum)
				{
				System.out.println("Strong Number");
				}
			else
				{
				System.out.println("Not Strong Number");
				}
	}
}