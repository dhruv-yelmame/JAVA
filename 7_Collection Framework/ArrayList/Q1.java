/*Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.*/

import java.util.*;
public class Q1
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
		
		
		for (int i = 0; i < al.size(); i++) 
		{
            System.out.print(al.get(i) + " ");
        }
			
	}
}