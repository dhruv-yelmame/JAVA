/*Q9. Replace each character in the string with the next character in ASCII sequence.
Input :- abcdZ
Output :- bcde[
*/

import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		String s1 = "";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			ch = (char)(ch+1);
			s1 +=ch;
		}
		
		System.out.print("New String: "+s1);
	}
}
