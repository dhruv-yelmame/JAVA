//Q6. Write a Java program to check whether a character is alphabetic or not.


import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the character: ");
		int ch = sc.next().charAt(0);
		
		if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z')
			System.out.print("alphabetic");
		else
			System.out.print("not alphabetic");
	}
}