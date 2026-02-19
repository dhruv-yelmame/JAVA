/*Q10. Count how many words in a string end with a vowel.
Input :- Java is easy to learn
Output :- 3
*/

import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		String words[] = s.split(" ");
		int count=0;
		for(int i=0; i<words.length; i++)
		{
			String w = words[i];
			char last = w.charAt(w.length()-1);
			if(last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')
				count++;
		}
		
		System.out.print("Count: "+count);
	}
}
