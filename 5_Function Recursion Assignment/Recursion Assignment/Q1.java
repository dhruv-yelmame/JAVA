// Q1. Write a Java program to print all natural numbers from 1 to n using recursion

import java.util.*;
public class Q1
{
    public static void show(int i, int n)
    {
        if(i>n)
            return;

        System.out.print(i + " ");
        show(i + 1, n);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        show(1, n);
    }
}
