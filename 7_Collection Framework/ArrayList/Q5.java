/*Q5. Store numbers in an ArrayList and count how many are even and how many are odd.*/

import java.util.*;
public class Q5
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
		
		int even=0,odd=0;
		
		for(int i=0; i<al.size(); i++)
		{	
			if(al.get(i)%2==0)
				even++;
			else
				odd++;
		}
		
		System.out.print("Even Count: "+even+"\t"+"Odd Count: "+odd);
	}
}
