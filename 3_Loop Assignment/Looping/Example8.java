/* Q8. Write a java program to find the sum of all odd numbers between 1 to n. */

import java.util.*;
public class Example8 {
    public static void main(String x[]) {  
        int sum = 0;
        int i = 1; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number (n): ");
        int n = sc.nextInt();
           
        while(i<=n) 
		{ 
            sum += i;
            i += 2; 
        } 
        System.out.println("The sum of odd number: "+sum);  
    }
}
