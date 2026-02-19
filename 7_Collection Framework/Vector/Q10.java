/*Q10.Write a Java program to store integer elements in a Vector and calculate the sum of all elements.
Input :- 10 20 30 40
Output :- Sum of Vector elements: 100
*/

import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter elements: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		int sum=0;
		for(int i=0; i<v.size(); i++)
		{
			sum+=v.get(i);
		}
		
		System.out.print("Sum: "+sum);
	}
}
