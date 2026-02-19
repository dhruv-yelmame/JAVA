//Q8. Write a Java program to find the longest word in a given sentence

import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		String ch[] = s.split(" ");
		String longest = "";
		int max=0;
		for(int i=0; i<ch.length; i++)
		{
		
			int len = ch[i].length();
			if(len > max)
			{
				max = len;
				longest = ch[i];
			}		
		}
		
		System.out.print("Longest Word: "+longest);
	}
}