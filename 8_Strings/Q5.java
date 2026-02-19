/*Q5. Write a Java program to remove duplicate characters from a string and print the result.
Input :- programming
Output :- progamin
*/
import java.util.*;
public class Q5
 {
    public static void main(String[] args) 
	{
		String s1 = "programming";
		  
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		   
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		   
		String s2 = "";
		for(char c : set)
		{
			s2 = s2 + c;
		}
		
       System.out.print(s2);
    }
}