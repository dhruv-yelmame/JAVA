/*Q7. Check whether a given string is a palindrome, ignoring spaces and case.
Input :- A man a plan a canal Panama
Output :- Palindrome
*/

import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine().toLowerCase();
		
		int left=0, right=s.length()-1;
		boolean flag=true;
		while(left < right)
		{
			if (s.charAt(left) == ' ') 
			{
                left++;
                continue;
            }

            if (s.charAt(right) == ' ') 
			{
                right--;
                continue;
            }
			
			if(s.charAt(left) != s.charAt(right))
			{
				flag=false;
				break;
			}
			left++;
			right--;
		}
		
		if(flag)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}