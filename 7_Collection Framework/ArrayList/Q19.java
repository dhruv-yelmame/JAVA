/*Q19. Check whether the ArrayList reads the same forward and backward.
Explanation
Use two indexes: start & end.
Compare elements until they meet.
Input :- [1, 2, 3, 2, 1]
Output :- Palindrome
*/

import java.util.*;
public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int start=0, end=al.size()-1;
		boolean flag=true;
		for(int i=0; i<al.size()/2; i++)
		{
			if(al.get(start)!=al.get(end))
			{
				flag=false;
				break;
			}
			start++;
			end--;
		}
		
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}