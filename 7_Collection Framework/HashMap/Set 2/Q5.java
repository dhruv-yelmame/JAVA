/*5. Find Top 3 Maximum Numbers using TreeSet
Problem Statement:
Given an array, find top 3 maximum numbers using TreeSet.
Input:
10 50 20 80 40 90 60
Output:
Top 3 = 90 80 60
*/

import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {10, 50, 20, 80, 40, 90, 60};
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		Iterator<Integer> i = set.descendingIterator();

        int count = 0;
        System.out.print("Top 3 = ");

        while (i.hasNext() && count < 3) 
		{
            System.out.print(i.next()+" ");
            count++;
        }
	}
}