/*Q2. Create an ArrayList of integers and calculate the sum of all elements.*/

import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int sum=0;
		for(int i=0; i<al.size(); i++)
		{
			sum = sum + al.get(i);
		}
		
		System.out.print("Sum: "+sum);
		
	}
}
