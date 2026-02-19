import java.util.*;
public class Ezio
{
   public static void main(String x1[])
   {
    Scanner sc = new Scanner(System.in);
	System.out.println("enter number of guards Ezio can control: ");
	int x = sc.nextInt();
	
	System.out.println("enter the number of guards present: ");
	int y = sc.nextInt();
	
	if(x>=y)
	{
	System.out.println("Yes");
	}
	else
	{
	System.out.println("No");
	}
	
   }
}