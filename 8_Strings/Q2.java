/*Q2. Given a sentence, reverse each word individually without changing the word positions.
Input :-  Java is very easy
Output :- avaJ si yrev ysae
*/

import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String: ");
		String s = sc.nextLine();
		String result = "";
		String words[] = s.split(" ");
		for(int i=0; i<words.length; i++)
		{
			String word = words[i];
            String rev = "";

            for (int j=word.length()-1; j>=0; j--) 
			{
                rev = rev + word.charAt(j);
            }
			
            result = result + rev + " ";
		}
		
		System.out.print("New String: "+result);
	}
}