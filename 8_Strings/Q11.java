/*Q11. Write a Java program to print all permutations of a given string.
Explanation / Logic:
Fix one character at a time
Rearrange remaining characters recursively or using loops
Generate all possible character arrangements
Total permutations = n!
*/

import java.util.*;
public class Q11 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
        String s = sc.nextLine();
		
        char ch[] = s.toCharArray();
        List<String> list = new ArrayList<>();
    
        for(int i=0; i<ch.length; i++)
        {
            for(int j=0; j<ch.length; j++)
            {
               for(int k=0; k<ch.length; k++)
                {
                   if (i != j && j != k && i != k) 
                   {
                        String res = "" + ch[i] + ch[j] + ch[k];
						System.out.print(res+" ");
                        list.add(res);
                   }
                }
             }
        }
        
       // System.out.print(list);
    }
}