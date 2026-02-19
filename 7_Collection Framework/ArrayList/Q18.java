/*Q18. Write a java program to Rotate the elements of an ArrayList left by K positions.
Explanation
Remove first element and add it at the end.
Repeat K times.
Input	:- Array: [1, 2, 3, 4, 5]	 K = 2
Output :- [3, 4, 5, 1, 2]
*/

import java.util.*;
public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter element: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		ArrayList<Integer> al2 = new ArrayList<>();
		System.out.print("enter rotate size(k): ");
		int k=sc.nextInt();
		
		for(int i=k; i<al.size(); i++)
		{
			al2.add(al.get(i));
		}
		
		for(int i=0; i<k; i++)
		{
			al2.add(al.get(i));
		}
		
		
		System.out.print("New List: "+al2);
	}
}
