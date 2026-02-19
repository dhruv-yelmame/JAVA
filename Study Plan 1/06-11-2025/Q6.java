/*6. Rotate Array Using Reversal Algorithm
Concept: Reverse parts of the array to achieve rotation in-place.
 Use Case: Efficient array manipulation.
Input: arr = [1, 2, 3, 4, 5, 6, 7]
d = 3
n = 7
Array after rotating left by 3 positions: [4, 5, 6, 7, 1, 2, 3]
*/


import java.util.*;
public class Q6
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of arr: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        int temp[] = new int[size];
        System.out.print("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
		System.out.print("enter the position to reverse: ");
		int index = sc.nextInt();
		int count=0;
		for(int i=index; i<size; i++)
		{
			temp[count++]=a[i];
		}
		for(int i=0; i<index; i++)
		{
			temp[count++]=a[i];
		}
		System.out.print("Array after rotating: ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(temp[i]+" ");
		}
		
		
    }
}

