/*11. Reverse ArrayList
Problem Statement:
Reverse elements of an ArrayList.
Input:
[1,2,3,4]
Output:
[4,3,2,1]
Explanation:
Use Collections.reverse().
*/

import java.util.*;
public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter elements: ");
		for(int i=0; i<4; i++)
		{
			al.add(sc.nextInt());
		}
		
		System.out.println("Before Reverse: "+al);
		
		Collections.reverse(al);
		
		System.out.println("After Reverse: "+al);

	}
}