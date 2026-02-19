/*20. Replace Value in HashMap
Problem Statement:
Replace marks of a student in HashMap.
Input:
Ravi = 60
Update Ravi = 85
Output:
Ravi = 85
Explanation:
Use map.replace().
*/

import java.util.*;
public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ravi", 60);
		System.out.println("Before Marks: "+map);
		map.replace("Ravi", 85);
		System.out.println("After Marks: "+map);
	}
}