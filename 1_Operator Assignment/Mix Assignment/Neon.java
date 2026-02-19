/*Q24. Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.

*/
import java.util.Scanner;
public class Neon
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number: ");
 int num = sc.nextInt();
 
 int sq = num * num;
 int neon = (sq%10) + sq / 10;
 
 String res = (neon == num )? "Neon" : "Non-Neon";
 System.out.println(res);
 }
}