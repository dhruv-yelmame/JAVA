/*Q12. Compress a string such that consecutive repeated characters are replaced by character followed by count.
Input :- aaabbccccd
Output :- a3b2c4d1
*/

import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
			
		String result = "";
		int i = 0;
		while(i < s.length())
		{
			char c = s.charAt(i);
			int count = 1;
			while(i + 1 < s.length() && s.charAt(i + 1) == c)
			{
				count++;
				i++;
			}
			
			result = result + c + count;
			i++;
		}
		
		System.out.print("New String: "+result);
	}
}