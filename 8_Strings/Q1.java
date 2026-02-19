/*Q1.Write a Java program to count the number of 
vowels, consonants, digits, and special characters present in a given string.*/

import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String: ");
		String s1 = sc.nextLine();
		
		int v=0;
		int c=0;
		int d=0;
		int s=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
				v++;
				
			else if((ch >=65 && ch <= 90) || (ch >= 97 && ch <= 122))
				c++;
			
			else if(ch >= 48 && ch <= 57)
				d++;
			
			else
				s++;
		}
		
		System.out.print("Vowels: "+v+"\t"+"Consonant: "+c+"\t"+"Digits: "+d+"\t"+"Special Character: "+s);
		
	}
}