/*18. Find Majority Element (> n/2 times)
Problem Statement:
Find element appearing more than n/2 times.
Input:
2 2 1 2 3 2 2
Output:
Majority = 2
Explanation:
Use HashMap for counting.
*/
import java.util.*;

public class Q18
{
    public static void main(String x[])
    {
        int a[] = {2, 2, 1, 2, 3, 2, 2};
        
        int n = a.length;
        int majority = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < a.length; i++)
        {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            
            if(map.get(a[i]) > n/2)
            {
                majority = a[i];
                break;
            }
        }
        
        System.out.println("Majority: " + majority);
    }
}