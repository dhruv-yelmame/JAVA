import java.util.*;
public class Example10
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
          System.out.println("28/29 days ");
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