/*3. Count Frequency of Each Element using HashMap
Problem Statement:
Write a Java program to count frequency of each element in an integer array using HashMap.
Input:
Array = 1 2 3 2 4 1 5 2
Output:
1 = 2
2 = 3
3 = 1
4 = 1
5 = 1
Explanation:
Use map.put(key, map.getOrDefault(key,0)+1).
*/

import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[8];
		System.out.print("enter element: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++)
		{
			map.put(a[i], map.getOrDefault(a[i],0)+1);
		}
		
		for(Map.Entry<Integer, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+"="+m.getValue());
		}
	}
}