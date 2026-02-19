/*Q5. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5
*/


public class Question30
{
    public static void main(String[] args)
    {
        int a[] = {10, 5, 3, 4, 3, 5, 6};
        int found = -1;

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] == a[j])
                {
                    found = a[i];
                    break;
                }
            }
            if (found != -1)
                break;
        }

        if (found != -1)
            System.out.println("First repeating element is " + found);
        else
            System.out.println("No repeating elements found");
    }
}
