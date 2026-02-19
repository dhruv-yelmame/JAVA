/*Q15. Reverse only alphabets in a string while keeping special characters in their original positions.
Input :- a,b$c
Output :- c,b$a
*/

import java.util.*;
public class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.next().toLowerCase();
		
		char ch[] = s.toCharArray();
		int start = 0, end = ch.length-1;
		while(start < end)
		{
		
			if(!(ch[start] >= 'a' && ch[start] <= 'z'))
			{
				start++;
			}
			else if(!(ch[end] >= 'a' && ch[end] <= 'z'))
			{
				end--;
			}
			else
			{
				char c = ch[start];
				ch[start]=ch[end];
				ch[end] = c;
				start++;
				end--;
			}
		}
		
		String s1 = new String(ch);
		System.out.print("New String: "+s1);
		
	}
}