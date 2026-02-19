/*Q1. Write a program in java to print next greater elements in a given unsorted array. Elements for which no greater element exists, consider the next greater element as -1.
		Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1
*/
public class Question36 
{
    public static void main(String x[]) 
	{

        int a[] = {5, 3, 10, 9, 6, 13};
        int b[] = new int[a.length];

        // Initialize b[] to -1 for all elements
        for (int i = 0; i < b.length; i++) 
		{
            b[i] = -1;
        }

        // Find next greater element
        for (int i = 0; i < a.length; i++)
		{
            for (int j = i + 1; j < a.length; j++) 
			{
                if (a[j] > a[i]) 
				{
                    b[i] = a[j];
                    break;  // first next greater found
                }
            }
        }

        // Print results
        System.out.println("Next Bigger Elements Array:");
        for (int i = 0; i < b.length; i++) 
		{
            System.out.print(b[i] + " ");
        }
    }
}
