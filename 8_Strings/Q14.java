/*Q14. Given a string and an integer K, find the lexicographically smallest and largest substrings of length K.
Explanation / Logic:
Generate all substrings of length K
Compare substrings using character-by-character comparison
Track smallest and largest values
*/

import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.next(); 
		int k = 3;
		String currentString = s.substring(0,k);
		String max = currentString;
		String min = currentString;
		
		for(int i=0; i<s.length(); i++)
		{
			currentString = currentString.substring(1,k)+s.charAt(i);
		
			if(max.compareTo(currentString) < 0)
				max = currentString;

			if(min.compareTo(currentString) > 0)
				min = currentString;
		}
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}