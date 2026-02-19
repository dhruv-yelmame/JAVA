/* Q57. Question:
If performance rating > 8, give 15% bonus; else if rating > 5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.
*/
import java.util.*;
public class Rating
{
 public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the performance rating out of 10: ");
    int rating = sc.nextInt();
    
    if(rating>8)
     {
      System.out.println("15% bonus");
     }
    else if(rating>5)
     {
      System.out.println("8% bonus");
     }
    else
     {
      System.out.println("no bonus");
     }
  }
}