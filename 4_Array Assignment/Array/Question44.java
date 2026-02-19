/*Q9. You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. 

Example 1: 
Input: digits = [1,2,3]    
Output: [1,2,4] 
Explanation: The array represents the integer 123. 
Incrementing by one gives 123 + 1 = 124. 
Thus, the result should be [1,2,4]. */
import java.util.*;

public class Question44
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int digits[] = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            digits[i] = sc.nextInt();
        }

        // Add 1 from last position
        for(int i = n - 1; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;         // simply increase & finish
                break;
            }
            else
            {
                digits[i] = 0;       // make zero and carry remains
            }
        }

        // Case: all were 9 → new array needed (e.g., 999 → 1000)
        if(digits[0] == 0)
        {
            int newArr[] = new int[n + 1];
            newArr[0] = 1;

            // Print new array
            for(int i=0; i<newArr.length; i++)
            {
                System.out.print(newArr[i] + " ");
            }
            return;
        }

       
        for(int i=0; i<n; i++)
        {
            System.out.print(digits[i] + " ");
        }
    }
}
