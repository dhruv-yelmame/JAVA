/*9. Store Student Names and Marks using HashMap
Problem Statement:
Store 5 student names and their marks in HashMap and display all records.
Input:
Amit = 80
Ravi = 70
Output:
Amit → 80
Ravi → 70

Explanation:
Use HashMap<String, Integer>.
*/
import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Amit", 80);
		map.put("Ravi", 70);
		
		System.out.println(map);
	}
}