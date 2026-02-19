/* Q21. Write a java program to check whether a number is neon or not.      	
        	Input : 9
        	Output : Neon Number
        	Explanation: square is 9*9 = 81 and
        	The sum of the digits of the square is 9.       */ 

			
import java.util.Scanner;
public class Example21
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number: ");
 int num = sc.nextInt();
 
 int sq = num * num;
 int neon = (sq%10) + sq / 10;
 
 if(neon == num)
 {
	System.out.println("Neon");
 }
 else
 {
	 System.out.println("Non-Neon");
 }

 }
}