import java.util.*;
public class Example9
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number(1-7): ");
    int choice = sc.nextInt();

    switch(choice){
    case 1:
          System.out.println("Monday");
          break;
    case 2:
          System.out.println("Tuesday");
          break;
    case 3:
          System.out.println("Wednsday");
          break;
    case 4:
          System.out.println("Thursday");
          break;
    case 5:
          System.out.println("Friday");
          break;
    case 6:
          System.out.println("Saturday");
          break;
    case 7:
          System.out.println("Sunday");
    default:
          System.out.println("Wrong Input");

    }
  }
}