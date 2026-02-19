/*Q32. Write a java program to display 1 to nth Strong Number.*/

import java.util.*;
public class Example32
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); // 150

        for(int i=1; i<=n; i++)
        {
            int temp = i;
            int sum = 0;

            while(temp > 0) {
                int rem = temp % 10;   
                int fact = 1;

                // factorial of digit
                for(int j=1; j<=rem; j++) 
				{
                    fact = fact * j;
                }

                sum = sum + fact;
                temp = temp / 10; 
            }

            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
