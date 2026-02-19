/*Q20. Write a java program to swap first and last digits of a number.*/

import java.util.*;

public class Example20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();     // Example: 12345
        int temp = n;

        int last = n % 10;
        int first = 0, pow = 1;

        while (n >= 10)
		{
            n /= 10;
            pow *= 10;
        }
        first = n;

        int middle = (temp % pow) / 10;
        int result = (last * pow) + (middle * 10) + first;

        System.out.println("Before Swap: " + temp);
        System.out.println("After Swap: " + result);
    }
}

