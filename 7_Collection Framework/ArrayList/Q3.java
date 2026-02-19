/*Q3. Write a program to find the maximum value from an integer ArrayList.*/


import java.util.*;
public class Q3
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
		
		int max=al.get(0);
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i) > max)
				max = al.get(i);
		}
		
		System.out.print("Max: "+max);
	}
}