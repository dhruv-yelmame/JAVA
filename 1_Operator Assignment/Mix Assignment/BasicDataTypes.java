//Q2. Write a java program to input all basic data types and print its output.

import java.util.Scanner;

 public class BasicDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input all basic data types
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a char value: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // Print all values
        System.out.println("\n--- You Entered ---");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
