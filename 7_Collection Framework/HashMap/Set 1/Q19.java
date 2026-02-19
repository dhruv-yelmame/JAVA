/*19. Find Second Largest Element using ArrayList
Problem Statement:
Find second largest number from an ArrayList.
Input:
[10, 50, 20, 80, 40]
Output:
Second Largest = 50
Explanation:
Sort list → access size()-2.
*/

import java.util.*;
public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter element: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		System.out.print("Second Largest: "+al.get(al.size()-2));
	}
}