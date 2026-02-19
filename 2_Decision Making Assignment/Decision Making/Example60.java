/* Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation:
 Switch on food item number. Print item name and price. Default for invalid selection.
 */

import java.util.*;
public class Example60
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the choice \n1: Burger \n2: Pizza \n3: Pasta \n4: Sandwich");
  int choice = sc.nextInt();
  
  switch(choice)
  {
   case 1:
    System.out.println("Item Name: Burger");
    System.out.println("Price: 99rs");
	break;
   case 2:
    System.out.println("Item Name: Pizza");
    System.out.println("Price: 199rs");
	break;
   case 3:
    System.out.println("Item Name: Pasta");
    System.out.println("Price: 149rs");
	break;
   case 4:
   System.out.println("Item Name: Sandwich");
    System.out.println("Price: 49rs");
	break;
   default:
    System.out.println("Invalid Selection");
  }
 }
}