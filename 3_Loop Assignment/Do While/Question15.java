//Q15. Write a java program to print all ASCII characters with their values.


import java.util.*;
public class Question15
{
	public static void main(String x[])
	{
		char ch = '0';
		do
		{
			System.out.println(ch+"->"+(int)ch);
			ch++;
		}while(ch<=256);
		
	}
}