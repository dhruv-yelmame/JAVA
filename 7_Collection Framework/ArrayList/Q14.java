/*Q4. Write a java program to find the second largest number in an ArrayList.*/

import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i) > fmax)
			{
				smax=fmax;
				fmax=al.get(i);
			}
			else if(al.get(i) != fmax && al.get(i) > smax)
			{
				smax=al.get(i);
			}
		}
		
		System.out.print("Second Max: "+smax);
	}
}

