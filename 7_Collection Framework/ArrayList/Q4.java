/*Q4. Create an ArrayList and find the minimum element.*/

import java.util.*;
public class Q4
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
		
		int min = al.get(0);
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i) < min)
				min = al.get(i);
		}
		
		System.out.print("Min: "+min);
		
	}
}