/*6. Insert an Element at a Specific Position
Concept: Shift elements from the target index to the right and place the new value.
 Use Case: Insert student records, product, etc.
Input: arr = [10, 20, 30, 40, 50]
Size = 5
Array after insertion: [10, 20, 25, 30, 40, 50]
*/

import java.util.*;
public class Q6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of arr: ");
		int size = sc.nextInt();
		
		int a[] = new int[size + 1];  // +1 to make space for new element
		
		System.out.println("Enter " + size + " elements:");
		for(int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter the position to insert (0 to " + size + "): ");
		int index = sc.nextInt();
		
		System.out.print("Enter the value to insert: ");
		int value = sc.nextInt();
		
		for(int i = size; i > index; i--)
		{
			a[i] = a[i - 1];
		}
		
		a[index] = value; 
		
		System.out.println("Array after insertion:");
		for(int i = 0; i <= size; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
