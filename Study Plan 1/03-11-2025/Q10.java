//Q10. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.


import java.util.*;
public class Q10
 {
    public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        double sqrt = Math.sqrt(num);

        String result = (sqrt == (int)sqrt) ? "Perfect Square" : "Not Perfect Square";

        System.out.println(result);
    }
}
