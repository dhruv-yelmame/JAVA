/*8. Check if Array is Sorted (Ascending or Descending)
Concept: Compare each element with the next and verify order.
 Use Case: Check data integrity or sort status.
Input: arr = [10, 20, 30, 40, 50]
Output: Array is sorted in ascending order.
*/


import java.util.*;
public class Q8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of arr: ");
        int size = sc.nextInt();
        
        int a[] = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        
        boolean ascending = true, descending = true;
        
        // Compare each element with the next one
        for(int i = 0; i < size - 1; i++)
        {
            if(a[i] > a[i + 1])
                ascending = false;
            
            if(a[i] < a[i + 1])
                descending = false;
        }
        
        // Display result
        if(ascending)
            System.out.println("Array is sorted in ascending order.");
        else if(descending)
            System.out.println("Array is sorted in descending order.");
        else
            System.out.println("Array is not sorted.");
    }
}

