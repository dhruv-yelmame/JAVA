import java.util.*;
public class Example45 
{
  public static void main(String x[])
  {
     Scanner sc = new Scanner(System.in);
     int currentVolume = 0;
	 
	
	 System.out.println("enter the Current Volume:");
	 int vol = sc.nextInt();//50
	 
	 System.out.println("enter the increase or decrease Volume:");
	 int incdre = sc.nextInt();//54
	 
	 int inc = vol-incdre;
	 int dec = incdre-vol;
	 
	 if(vol>incdre)
	 {
		 System.out.println(inc);
	 }
	 else
	 {
		 System.out.println(dec);
	 }
	 
    
     
  }
}