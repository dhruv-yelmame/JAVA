/*Q20. Given an ArrayList where every element occurs even number of times except one, 
find that element.
Input :- [2, 3, 5, 4, 5, 2, 4, 3, 5]
Output :- 5
*/

import java.util.*;
public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter element: ");
		for(int i=0; i<9; i++)
		{
			al.add(sc.nextInt());
		}
		
		int element=0;
		for(int i=0; i<al.size(); i++)
		{
			int count=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i)==al.get(j))
					count++;
			}
			
			if(count%2!=0)
			{
				element=al.get(i);
			}
		}
		
		System.out.print("Element: "+element);
	}
}
