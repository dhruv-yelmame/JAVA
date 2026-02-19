/* Q57. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
 */
 
import java.util.*;
public class Example57
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the employee level (1-3)");
  int emp = sc.nextInt();
  
  switch(emp)
  {
    case 1:
        System.out.println("Salary range: 20,000 - 30,000");
		break;
	case 2:
        System.out.println("Salary range: 31,000 - 50,000");
		break;
	case 3:
        System.out.println("Salary range: 51,000 - 80,000");
		break;
	default:
	    System.out.println("Invalid Number");
  }
  
 }
}