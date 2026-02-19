//Q19. Write a Java program that reads a number and display the cube.

import java.util.Scanner;
public class Cube
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number: ");
   int num = sc.nextInt();
   
   num = num*num*num;
   System.out.println("The Cube of Number is: "+num);
  }
}