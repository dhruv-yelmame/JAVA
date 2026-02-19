import java.util.*;
public class CRED 
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("enter your CRED points:");
	int cred = sc.nextInt();
	
	if(cred>750)
	{
	System.out.println("Yes");
	}
	else
	{
	System.out.println("No");
	}
  }
}