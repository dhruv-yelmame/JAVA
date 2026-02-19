//Q17. Write a Java program to convert seconds to hours, minutes and seconds
import java.util.Scanner;
public class SHM
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("enter the seconds: ");
 int sec = sc.nextInt();

 int hour =  sec/3600;
 sec = sec - hour*3600;
 int min = sec/60;
 sec = sec - min*60;
 
 System.out.println("In Hours: "+hour);
 System.out.println("In Minutes: "+min);
 System.out.println("In Seconds: "+sec);
 
 }
}