/*2. Store Even Numbers in ArrayList
Problem Statement:
Write a Java program that stores only even numbers from an array into an ArrayList.
Input:
Array = 11 22 33 44 55 66
Output:
Even Numbers List = [22, 44, 66]
Explanation:
Traverse array → check arr[i] % 2 == 0 → add into ArrayList.
*/


import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.print("enter the elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList al = new ArrayList();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				al.add(arr[i]);
		}
		System.out.print(al);
	}
}
