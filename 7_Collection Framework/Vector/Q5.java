/*Q5. Write a java program to check if a Vector is empty.
Input :- No Values                 Output :- Vector is empty
*/

import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		
		if(v.isEmpty())
		{
			System.out.print("Vector is empty");
		}
		else
		{
			System.out.print("Vector is not empty");
		}
			
	}
}