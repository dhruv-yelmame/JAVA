/* 
Q5. Longest Subarray with Sum K (positive numbers)
Example:
Input: arr = [4, 1, 1, 1, 2, 3, 5], K = 5
Output: 4
*/

public class Q5
{
    public static void main(String x[])
    {
        int a[] = {4, 1, 1, 1, 2, 3, 5};
        int K = 5;

        int sum = 0;
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < a.length; end++)
        {
            sum = sum + a[end];

            while (sum > K)
            {
                sum = sum - a[start];
                start++;
            }

            if (sum == K)
            {
                int len = end - start + 1;
                if (len > maxLen)
                {
                    maxLen = len;
                }
            }
        }

        System.out.println("Longest subarray length with sum " + K + " is: " + maxLen);
    }
}
