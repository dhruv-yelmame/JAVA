/* Q38. Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.
 */

import java.util.*;
public class Example38
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("ennter the attendance: ");
	int at = sc.nextInt();
	
	System.out.println("ennter the marks: ");
	int mr = sc.nextInt();
	
	if(at>=75 && mr>=80)
	{
	System.out.println("student is eligible for scholarship");
	}
	else
	{
	System.out.println("student is not eligible for scholarship");
	}
	
  }
}
