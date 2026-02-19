/*Q3. Write a java program to access and print each element of Vector using index.
Input :- 100 200 300		Output :- 100 200 300
*/

import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter element: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		for(int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i) + " ");
		}
	}
}