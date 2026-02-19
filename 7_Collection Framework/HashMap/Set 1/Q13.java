/*13. Find Maximum Value in ArrayList
Problem Statement:
Find maximum value stored in an ArrayList.
Input:
[10, 50, 20, 80, 40]
Output:
Maximum = 80
Explanation:
Use Collections.max().
*/

import java.util.*;
public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("enter element: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		System.out.println("Maximum Element: "+Collections.max(al));
	}
}