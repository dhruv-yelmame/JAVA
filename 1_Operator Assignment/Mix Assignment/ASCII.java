/*
Q27. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.
·        Example: a → A, Z → z.
*/

import java.util.*;
public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet character: ");
        char ch = sc.next().charAt(0);

        // Toggle case using XOR with 32 (ASCII trick)
        char toggled = (char)(ch ^ 32);

        System.out.println("Toggled case: " + toggled);
    }
}

