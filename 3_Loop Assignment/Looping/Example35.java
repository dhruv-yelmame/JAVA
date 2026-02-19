/*Q35. Write a java program to enter a number and print it in words.
*/

import java.util.*;

	public class Example35
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number: ");
			int n = sc.nextInt();//48
			
			while(n>0)
			{
				if(n==1)
				{
					System.out.print(" One ") ;
					n=n-1;
				}
				if(n==2)
				{
					System.out.print(" Two ") ;
					n=n-2;
				}
				if(n==3)
				{
					System.out.print(" Three ") ;
					n=n-3;
				}
				if(n==4)
				{
					System.out.print(" Four ") ;
					n=n-4;
				}
				if(n==5)
				{
					System.out.print(" Five ") ;
					n=n-5;
				}
				if(n==6)
				{
					System.out.print(" Six ") ;
					n=n-6;
				}
				if(n==7)
				{
					System.out.print(" Seven ") ;
					n=n-7;
				}
				if(n==8)
				{
					System.out.print(" Eight ") ;
					n=n-8;
				}
				if(n==9)
				{
					System.out.print(" Nine ") ;
					n=n-9;
				}
				if(n==10)
				{
					System.out.print(" Ten ") ;
					n=n-10;
				}
				if(n>=1 && n<20)
				{
					System.out.print(" 11-19 "); 
					n=n-40;
				}
				if(n>=20 && n<30)
				{
					System.out.print(" Twenty "); 
					n=n-20;
				}
				if(n>=30 && n<40)
				{
					System.out.print(" Thirty "); 
					n=n-30;
				}
				if(n>=40 && n<50)
				{
					System.out.print("Fourty"); 
					n=n-40;
				}
				if(n>=50 && n<60)
				{
					System.out.print(" Fifty "); 
					n=n-50;
				}
				if(n>=60 &&n<70)
				{
					System.out.print(" Sixty "); 
					n=n-60;
				}
				if(n>=70 &&n<80)
				{
					System.out.print(" Seventy "); 
					n=n-70;
				}
				if(n>=80 &&n<90)
				{
					System.out.print(" Eighty "); 
					n=n-80;
				}
				if(n>=90 &&n<100)
				{
					System.out.print(" Ninty "); 
					n=n-90;
				}
			}
		}
}