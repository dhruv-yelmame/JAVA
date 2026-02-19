/*7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.
*/

import java.util.*;
class Voter
{
	public void isEligible(int age)
	{
		String res = (age>=18)?"eligible to vote":"not eligible to vote";
		System.out.print(res);
	}
}

public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the age: ");
		int age = sc.nextInt();
		
		Voter v = new Voter();
		v.isEligible(age);
	}
}