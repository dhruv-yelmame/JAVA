/*9. Check if Array is Palindrome
Idea: Compare elements at two pointers from start and end, move inward, check if all pairs match.
Example:
 arr = [1, 2, 3, 2, 1] → palindrome
 arr = [1, 2, 3, 4, 5] → not palindrome
*/


import java.util.*;
public class Q9
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of arr: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.print("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
		
		boolean isPalindrome = true;
        int start = 0, end = size - 1;
        while(start<end)
        {
            if (a[start]!=a[end])
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome)
            System.out.println("Palindrome Array");
        else
            System.out.println("Not Palindrome Array");
    }
}
