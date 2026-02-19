//Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.



import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the character: ");
		int ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				System.out.println("Vowel");
			else
				System.out.println("Consonant");
		}
		else
		{
			System.out.println("Invalid input! Please enter an alphabet.");
		}
	}
}