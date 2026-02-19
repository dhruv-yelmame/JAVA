//Q3.Write a Java program to find the most frequently occurring character in a string.


import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		
		char ch[] = s.toCharArray();
		
		char c = ch[0];
		int maxCount=0;
		boolean visited[] = new boolean[ch.length];
		
		for(int i=0; i<ch.length; i++)
		{
			if(visited[i])
				continue;
			
			int count=0;
			for(int j=0; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					visited[j] = true;
					count++;
				}	
			}
			
			if(count>maxCount)
			{
				maxCount=count;
				c=ch[i];
			}
		}
		
		System.out.print("Max: "+c);
		
	}
}