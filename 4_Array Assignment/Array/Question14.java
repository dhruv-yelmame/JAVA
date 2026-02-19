/*Q9.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
*/

import java.util.*;
public class  Question14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // STEP 1: Sort array manually (using simple bubble sort)
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - 1 - i; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.print("Unique elements = ");

        // STEP 2: Print unique values
        System.out.print(a[0] + " ");  // print first element

        for(int i = 1; i < size; i++) 
		{
            if(a[i] != a[i - 1]) 
			{
                System.out.print(a[i] + " ");
        }
		}
	}
}