/*Q13. Check whether two strings are isomorphic.
Example:
 egg and add → Isomorphic
 foo and bar → Not Isomorphic
*/

import java.util.*;
public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string 1: ");
		String s1 = sc.nextLine();
		System.out.print("enter string 2: ");
		String s2 = sc.nextLine();
		
		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		
		for(int i=0; i<s1.length(); i++)
			set1.add(s1.charAt(i));
		
		for(int i=0; i<s2.length(); i++)
			set2.add(s2.charAt(i));
		
		if(set1.size() == set2.size())
			System.out.print("Isomorphic");
		else
			System.out.print("Not Isomorphic");
	}
}