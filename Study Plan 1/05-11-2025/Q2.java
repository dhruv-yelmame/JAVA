/*2. Count Frequency of Each Element
Concept: Use nested loops or a hash map to count how often each number appears.
 Example:  arr = [4, 5, 6, 4, 5, 7, 4]
Output:
Element 4 occurs 3 times 
Element 5 occurs 2 times 
Element 6 occurs 1 time 
Element 7 occurs 1 time  
*/


import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the values of array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		boolean visited[] = new boolean[size];
		for(int i=0; i<a.length; i++)
		{
			if(visited[i] == true)
				continue;
			
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{	
					count++;
					visited[j] = true;
				}
			}
			
			System.out.println("Element "+a[i]+" occurs "+count+" time");
		}
		
	}
}