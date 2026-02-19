/*Q16. Given an ArrayList of integers, find the first element that occurs only once.
Explanation
For each element, count how many times it appears.
The first element with count 1 is the answer.
Input:- [4, 5, 1, 2, 0, 4]		Output :- 5
*/

import java.util.*;
public class Q16
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>(); 
		System.out.print("enter element: ");
		for(int i=0; i<6; i++)
		{
			al.add(sc.nextInt());
		}
		
		for(int i=0; i<al.size(); i++)
		{
			int count=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i)==al.get(j))
					count++;
			}
			
			if(count==1)
			{
				System.out.print(al.get(i));
				break;
			}
		}
	}
}