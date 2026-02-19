/* Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.
Explanation:
 Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.

 */
import java.util.*;
public class Example51
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the month number(1-12): ");
    int choice = sc.nextInt();

    switch(choice){
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
          System.out.println("31 days");
          break;
    case 2:
	    System.out.println("enter the year: ");
		int year = sc.nextInt();
	    if(year%4==0 && year%400==0)
		{
		System.out.println("29 days");
		}
		else
		{
		System.out.println("28 days");
		}
          
          break;
    case 4:
    case 6:
    case 9:
    case 11:
          System.out.println("30 days");
          break;
   
    default:
          System.out.println("Wrong Input");

    }
  }
}