/*Q49. Task: For a number n, calculate:
Sum of digits at even places (from right)
Sum of digits at odd places (from right)
Finally print the difference of these sums.
Example: n = 572631 → even places sum = 7+6+1 = 14, odd places sum = 5+2+3 = 10 → difference = 4.
Hint: Use a loop with position tracking.
*/

import java.util.*;
public class Example49
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//1234
		int temp=n;
		int count=0, rem=0, sumEven=0, sumOdd=0;
		int position=1;
		
		
		while(n!=0)
		{
			if(position%2==0)
			{
				rem = n%10;
				sumEven +=rem;
			}
			else
			{
				rem = n%10;
				sumOdd +=rem;
			}
			
			position++;	
			n=n/10;
		}
		
		System.out.println("Even Place Sum: "+sumEven);
		System.out.println("Odd Place Sum: "+sumOdd);
		System.out.println("Difference: "+(sumEven-sumOdd));
		
	}
}