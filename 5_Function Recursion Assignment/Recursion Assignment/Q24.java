// Q24. Check Number is Strong Number or Not using Recursion


import java.util.*;
public class Q24
{
    public static int fact(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static int show(int n)
    {
        if (n == 0)
            return 0;

        int rem = n % 10;                 
        return fact(rem) + show(n / 10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = show(n);

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}
