/*Q2. Write a program to find the number of elements in a Vector.
Input :- 5  25  15                    Output :- Size of Vector: 3
*/

import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter the elements: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		System.out.print("Size of Vector: "+v.size());
	}
}