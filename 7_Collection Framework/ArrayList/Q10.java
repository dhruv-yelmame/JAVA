/*Q10. Write a java program to Identify and display duplicate numbers in an integer ArrayList.*/

import java.util.*;
public class Q10
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
		
		System.out.print("Duplicate Number: ");
		boolean visit[] = new boolean[al.size()];
		for(int i=0; i<al.size(); i++)
		{
			if(visit[i])
				continue;
			
			int count=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					count++;
					visit[j]=true;
				}
			}
			
			if(count>1)
				System.out.print(al.get(i)+" ");
		}
	}
}
