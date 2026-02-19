/*7. Delete an Element from a Specific Position
Concept: Shift elements to the left to overwrite the removed value.
 Use Case: Remove items from a list, logs, etc.
Input: arr = [10, 20, 30, 40, 50]
Size = 5
Array after deletion: [10, 20, 40, 50]
*/


import java.util.*;
public class Q7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of arr: ");
        int size = sc.nextInt();
        
        int a[] = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter the index to delete (0 to " + (size - 1) + "): ");
        int index = sc.nextInt();
        
        for(int i = index; i < size - 1; i++)
        {
            a[i] = a[i + 1];
        }
        
        size--; // Reduce size after deletion
        
        System.out.println("Array after deletion:");
        for(int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
