/*Q7. Write a java program to Remove all even numbers from an integer ArrayList.*/


import java.util.*;
public class Q7
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
		
		
		for(int i=al.size()-1; i>=0; i--)
		{
			if(al.get(i)%2==0)
			{
				al.remove(i);
			}
		}
		
		System.out.println("New List: "+al);
	}
}
