/*Q52. Write a java program to display following series :
	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 
*/

public class Example52
{
	public static void main(String x[])
	{
		int j=9;
		for(int i=1; i<=18; i++)
		{
			if(i%2!=0)
			{
				System.out.print((1+i)+" ");
			}
			else
			{		
				System.out.print((j*j*j)+" ");
				j--;
			}
		}
	}
}



/* input from user 


import java.util.*;
public class Sample
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int j = sc.nextInt();//9
		int j1=j*2;
		for(int i=1; i<=(j1); i++)
		{
			if(i%2!=0)
			{
				System.out.print((1+i)+" ");
			}
			else
			{
				System.out.print((j*j*j)+" ");
				j--;
			}
			
		}
	}
}

 */