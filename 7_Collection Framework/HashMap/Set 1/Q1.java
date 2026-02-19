/*1. Remove Duplicate Elements from Array using HashSet
Problem Statement:
Write a Java program that accepts an integer array of size N and removes duplicate elements using HashSet. 
Display the unique elements.
Input:
N = 8
Array = 10 20 30 20 40 10 50 30
Output:
Unique Elements = 10 20 30 40 50
Explanation:
Use HashSet to automatically remove duplicates and print elements.
*/

import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		System.out.print("enter the elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		TreeSet set = new TreeSet();
		for(int i=0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		
		System.out.print(set);
	}
}
