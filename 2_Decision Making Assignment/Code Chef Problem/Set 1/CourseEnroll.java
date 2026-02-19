import java.util.*;
public class CourseEnroll
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number of students to enroll: ");
  int nn = sc.nextInt();
  
  System.out.println("enter the maximum capacity of students: ");
  int mm = sc.nextInt();
  
  System.out.println("enter the number of students who have already register: ");
  int kk= sc.nextInt();
  
  int space = nn+kk;
  
  if(space<=mm)
  {
	System.out.println("Yes");
  }
  else
  {
	System.out.println("No");
  }
  
 }
}