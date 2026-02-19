/*Q6. Find the first character in a string that does not repeat.
Input :- aabbcdeff
Output :-  c
*/

import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			char c = s.charAt(i);
			for(int j=0; j<s.length(); j++)
			{
				char ch = s.charAt(j);
				if(c==ch)
					count++;
			}
			
			if(count==1)
			{
				System.out.print(c);
				break;
			}
		}
	}
}