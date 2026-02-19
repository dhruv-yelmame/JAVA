//Q29. Write a java program to display 1 to nth Prime Number.

import java.util.*;
public class Q29
{
    public static int checkPrime(int n, int i)
    {
        if (i == n)
            return 1;

        if (n % i == 0)
            return 0;

        return checkPrime(n, i + 1);
    }

    public static void show(int n, int i)
    {
        if (i > n)
            return;

        if (i > 1 && checkPrime(i, 2) == 1)
            System.out.print(i + " ");

        show(n, i + 1);
    }

    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to display: ");
        int n = sc.nextInt();

        show(n, 1);
    }
}
