//Q10. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

import java.util.*;
public class PerfectNumber
{
	 public static void main(String x[])
		 {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("enter the number: ");
			  int num = sc.nextInt();
			  int sqr = (int)Math.sqrt(num);
			  String msg =(sqr*sqr==num)?"Perfect Square":"Not Perfect Square";
			  System.out.println(msg);
		 }
}