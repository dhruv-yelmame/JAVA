//Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.



import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the character: ");
		int ch = sc.next().charAt(0);
		
		if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z')
			System.out.print("alphabetic");
		else if(ch>='0' && ch<='9')
			System.out.print("digit");
		else
			System.out.print("special character");
	}
}