/*Q10. Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
*/

import java.util.*;
public class Question15
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int size = sc.nextInt();

        int a[] = new int[size];
        int b[] = new int[size];

        System.out.println("Enter values of Array 1: ");
        for(int i=0; i<a.length; i++) 
		{	
			a[i] = sc.nextInt();
		}
		
        System.out.println("Enter values of Array 2: ");
        for(int i=0; i<b.length; i++) 
		{
			b[i] = sc.nextInt();
		}
		
        System.out.print("Common elements: ");
        for(int i=0; i<a.length; i++) 
		{
            for(int j=0; j<b.length; j++) 
			{
                if(a[i] == b[j])
				{
                    System.out.print(a[i] + " ");
                    break; // stop inner loop once found
                }
            }
        }
    }
}
