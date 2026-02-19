/* Q58. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
Explanation:
 Switch on user choice. Use variables for balance and update accordingly.

 */

import java.util.*;
public class Example58
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the balance: ");
  int balance = sc.nextInt();
  int totalbalance=0;
  System.out.println("choice the \n1: Deposit \n2: Withdraw \n3: Check Balance \n4: Exit");
  int choice = sc.nextInt();
  
  switch(choice)
  {
    case 1:
     System.out.println("Please enter the amount for deposit");
	 int dep = sc.nextInt();
	 totalbalance = balance + dep;
	 System.out.println("total balance is: "+totalbalance);
	 break;
	case 2:
     System.out.println("Please enter the amount for withdraw");
	 int with = sc.nextInt();
	 totalbalance = balance - with;
     System.out.println("total balance is: "+totalbalance);
	 break;
	case 3:
	 System.out.println("Availadbale Balance: "+balance);
	 break;
	case 4:
     System.out.println("Thank you");
	 break;
	 
	default:
	 System.out.println("Invalid Number");
  }
 }
}
