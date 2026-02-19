/*Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.*/

import java.util.*;
public class Q8
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
		
		int start=0, end=al.size()-1;
		while(start < end)
		{
			int temp = al.get(start);
			al.set(start, al.get(end));
			al.set(end,temp);
			start++;
			end--;
		}
		
		System.out.print("Reverse List: "+al);
	}
}
