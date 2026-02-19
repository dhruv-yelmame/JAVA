/*Q23. Write a java program to Check Number Is Duck Number or Not.*/
//A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.

import java.util.*;
public class Example23
{   
  public static void main(String x[])
	{  
	Scanner sc  = new Scanner(System.in);
	int no,rem;
    boolean flag=false;
	System.out.println("Enter the number: ");
	no=sc.nextInt();//1021
	
	while(no!=0)//1021!=0,102!=0,10!=0
		{
		  rem  = no % 10;//1,2,0
		  
		   if(rem == 0)
		    { 
	        flag=true;
		    }
			no  = no / 10;//102,10,1
		}
		   
		 if(flag)
		   {  
	        System.out.println("Number is duck");
		   }
		 else
		   {
		    System.out.println("Number is not duck");
		   }
	}
}

